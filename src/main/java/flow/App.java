package flow;

import java.util.LinkedList;
import java.util.Queue;

public class App implements IApp<String> {

    private Queue<String> responses;

    public App() {
        this.responses = new LinkedList<>();
    }


    @Override
    public String in(IEvent event) throws EventException, ActionException {
        String request = (String) event.trigger();
        String response = makeResponse(request);
        responses.add(response);
        return response;
    }
    private String makeResponse(String request) {
        String value = request.replace("Request:", "");
        return "E-mail:" + value;
    }

    public String popResponse() {
        return responses.remove();
    }

    @Override
    public String toString() {
        return "App{" +
                "responses=" + responses;
    }
}
