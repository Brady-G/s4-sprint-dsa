package green.brady;

import green.brady.users.User;
import green.brady.users.UserManager;

public class Main {

    private static final UserManager users = new UserManager();

    public static void main(String[] args) {
        users.createUser("brady");
        users.createUser("jane");
        users.createUser("brady"); //Wont create a new user because the username already exists

        users.getUser("brady").addTask("Do the dishes");
        users.getUser("brady").addTask("Walk the dog");

        users.getUser("jane").addTask("Buy groceries");
        users.getUser("jane").addTask("Clean the bathroom");

        users.getUser("brady").completeTask(1);
        users.getUser("jane").completeTask("Buy groceries");

        for (User user : users.getUsers()) {
            user.printTasks();
        }
    }
}