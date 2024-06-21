package green.brady.tasks;

public class TaskList {

    private int nextId = 1;
    private Node head;

    public TaskList() {
        this.head = null;
    }

    public Task add(String description) {
        Task task = new Task(nextId++, description, false);
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return task;
    }

    public void complete(int task) {
        Node current = head;
        while (current != null) {
            if (current.task.id() == task) {
                current.task.complete();
                break;
            }
            current = current.next;
        }
    }

    public void complete(String description) {
        Node current = head;
        while (current != null) {
            if (current.task.description().equals(description)) {
                current.task.complete();
                break;
            }
            current = current.next;
        }
    }

    public void print() {
        Node current = head;
        System.out.println("⎯".repeat(100));
        while (current != null) {
            System.out.println(current.task.id() + ": " + current.task.description() + " - " + (current.task.completed() ? "✅" : "❎"));
            current = current.next;
        }
        System.out.println("⎯".repeat(100));
    }

    private static class Node {
        Task task;
        Node next;

        public Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }
}
