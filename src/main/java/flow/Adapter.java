package flow;

public class Adapter implements IAdapter<IAction> {

    @Override
    public IEvent adapt(IAction action) throws AdapterException, ActionException {
        String value = (String) action.execute();
        return new Event(value);
    }
}
