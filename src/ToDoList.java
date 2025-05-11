import java.util.LinkedList;
import java.util.List;

public class ToDoList {

    private List<Task> taskList = new LinkedList<>();

    public void addTask(Task task) {
        taskList.add(task);
        System.out.println("You have added a task.");
    }

    public void completeTask(Task task) {
        task.isCompleted = true;
        System.out.println("You have completed a task.");
    }

    public void displayTasks() {
        for (Task task : taskList) {
            if (task.isCompleted) {
            }
            else {
                System.out.println(task.getDescription());
            }
        }
    }
}
