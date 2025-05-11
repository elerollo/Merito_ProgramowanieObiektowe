public class Task {
    private String description;
    public boolean isCompleted;

    public Task(String description, boolean isCompleted) {
        this.description = description;
        this.isCompleted = false;
    }

    public void complete() {
        this.isCompleted = true;
    }

    public String getDescription() {
        return description;
    }
}
