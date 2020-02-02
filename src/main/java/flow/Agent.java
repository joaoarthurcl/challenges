package flow;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Agent implements IAgent{

    private String[] values;

    public Agent(String... values) {
        this.values = values;
    }

    @Override
    public Queue<IAction> act() throws AgentException {
        Queue<IAction> flow = new LinkedList<>();
        for (String value : values) {
            flow.add(new Action(value));
        }
        return flow;
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }
}
