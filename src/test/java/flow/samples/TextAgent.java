package flow.samples;

import flow.IAction;
import flow.IAgent;

import java.util.LinkedList;
import java.util.Queue;

public class TextAgent implements IAgent {
  private String[] values;

  public TextAgent(String... values) {
    this.values = values;
  }

  public Queue<IAction> act() {
    Queue<IAction> flow = new LinkedList<IAction>();
    for (String value : values) {
      flow.add(new TextAction(value));
    }
    return flow;
  }
}
