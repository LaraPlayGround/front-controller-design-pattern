// Dispatcher class
public class Dispatcher {
    private HomeController homeController;
    private UserController userController;

    public Dispatcher() {
        homeController = new HomeController();
        userController = new UserController();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("HOME")) {
            homeController.show();
        } else if (request.equalsIgnoreCase("USER")) {
            userController.show();
        } else {
            System.out.println("Invalid request!");
        }
    }
}
