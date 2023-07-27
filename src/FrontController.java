// FrontController class
public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        // Add authentication logic here
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Request: " + request);
    }

    public void dispatchRequest(String request) {
        // Log each request
        trackRequest(request);

        // Authenticate the user
        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        } else {
            System.out.println("Unauthorized access!");
        }
    }
}
