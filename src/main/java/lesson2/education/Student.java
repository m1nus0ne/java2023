package lesson2.education;

import lesson2.education.Task.Task;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@Builder(setterPrefix = "with", builderMethodName = "privateBuilder")
public class Student {
    private List<Task> tasks;

    private int id;

    private double totalPoints;
    private int age;

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

    @Deprecated
    private static Student.StudentBuilder builder(int value) {
        return privateBuilder().withId(value);


    }
}
