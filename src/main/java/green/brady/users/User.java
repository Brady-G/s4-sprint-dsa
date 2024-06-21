package green.brady.users;

import green.brady.tasks.TaskList;

public record User(
        String username,
        TaskList tasks
) {

    public User(String username) {
        this(username, new TaskList());
    }

    public void addTask(String description) {
        tasks.add(description);
    }

    public void completeTask(int taskId) {
        tasks.complete(taskId);
    }

    public void completeTask(String descrption) {
        tasks.complete(descrption);
    }

    public void printTasks() {
        tasks.print();
    }
}
