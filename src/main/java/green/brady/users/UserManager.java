package green.brady.users;

import java.util.Objects;

public class UserManager {

    private User[] users = new User[0];

    public User[] getUsers() {
        return users;
    }

    public User getUser(String username) {
        for (User user : users) {
            if (Objects.equals(user.username(), username)) {
                return user;
            }
        }
        return null;
    }

    public User createUser(String username) {
        if (getUser(username) != null) return null;

        User user = new User(username);
        User[] newUsers = new User[users.length + 1];
        System.arraycopy(users, 0, newUsers, 0, users.length);
        newUsers[users.length] = user;
        users = newUsers;
        return user;
    }

}
