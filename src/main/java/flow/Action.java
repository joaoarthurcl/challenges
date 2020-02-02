package flow;


public class Action implements IAction<String>{

    private String value;

    public Action(String value) {
        this.value = value;
    }


    @Override
    public String execute() throws ActionException {
        return value;
    }

    @Override
    public String getType() {
        return "TEXT";
    }

    @Override
    public String toString() {
        return value;
    }
}
