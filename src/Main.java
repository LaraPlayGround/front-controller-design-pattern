public class Main {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();

        // Simulate client requests
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("USER");
        frontController.dispatchRequest("LOGIN");
    }
}
