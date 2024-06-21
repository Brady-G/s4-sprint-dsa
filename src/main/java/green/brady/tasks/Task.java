package green.brady.tasks;

public class Task {
    private final int id;
    private final String description;
    private boolean completed;

    public Task(
            int id,
            String description,
            boolean completed
    ) {
        this.id = id;
        this.description = description;
        this.completed = completed;
    }

    public int id() {
        return id;
    }

    public String description() {
        return description;
    }

    public boolean completed() {
        return completed;
    }

    public void complete() {
        completed = true;
    }
}