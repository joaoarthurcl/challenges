package flow;

public class Event implements IEvent<String> {

    private String value;

    public Event() {
    }

    public Event(String value) {
        this.value = value;
    }

    @Override
    public String trigger() throws EventException, ActionException {
        return value;
    }
}
