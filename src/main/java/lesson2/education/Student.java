package lesson2.education;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Task> tasks;

    private int id;

    public double totalPoints;

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Student(int id) {
        this.id = id;
        this.tasks = new ArrayList<>();
    }

    public double getTotalPoints() {
        return totalPoints;
    }

    public void calcTotalPoint() {
        for (Task task : tasks
        ) {
            if (task.getMark() != null)
                totalPoints += task.getMark().getScore();
        }
    }
}
