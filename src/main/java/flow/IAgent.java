package flow;

import java.util.Queue;

public interface IAgent {
  Queue<IAction> act() throws AgentException;
}