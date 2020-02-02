package flow;

import java.util.Map;
import java.util.Queue;

public class Engine {
  private IApp app;
  private IAgent agent;
  private Map<String, IAdapter> adapters;

  public Engine(IAgent agent, Map<String, IAdapter> adapters, IApp app) {
    this.adapters = adapters;
    this.agent = agent;
    this.app = app;
  }

  public void run() throws AgentException, EmptyFlowException, AdapterNotFoundException, AdapterException, ActionException, EventException, ProtocolException, AppException {
    Queue<IAction> flow = agent.act();
    if (flow.isEmpty()) {
      throw new EmptyFlowException();
    }

    for (IAction action : flow) {
      String type = action.getType();
      if (!adapters.containsKey(type)) {
        throw new AdapterNotFoundException();
      }
      app.in(adapters.get(type).adapt(action));
    }
  }

  public IApp getApp() {
    return app;
  }

  public Map<String, IAdapter> getAdapters() {
    return adapters;
  }

  public IAgent getAgent() {
    return agent;
  }

}
