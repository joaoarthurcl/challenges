package flow;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws AgentException, ActionException, AdapterException, EventException, EmptyFlowException, AdapterNotFoundException, AppException, ProtocolException {
        Map<String, IAdapter> adapters = new HashMap();
        Engine engine = new Engine(new Agent("hello"), adapters, new App());
        adapters.put("TEXT", new Adapter());
        engine.run();
        App app = (App) engine.getApp();

        System.out.println(app.popResponse());

    }
}