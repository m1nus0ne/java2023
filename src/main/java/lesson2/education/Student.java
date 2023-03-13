package lesson2.education;

import lesson2.education.Task.Task;

import java.util.ArrayList;
import java.util.List;

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

    public static final class StudentBuilder {
        private List<Task> tasks;
        private int id;
        private double totalPoints;
        private int age;


        public StudentBuilder(int id) {
            this.id = id;
        }

        public StudentBuilder withTasks(List<Task> tasks) {
            this.tasks = tasks;
            return this;
        }


        public StudentBuilder withTotalPoints(double totalPoints) {
            this.totalPoints = totalPoints;
            return this;
        }

        public StudentBuilder withAge(int age) {
            this.age = age;
            return this;
        }



        public Student build() {
            Student student = new Student(id);
            student.totalPoints = this.totalPoints;
            student.age = this.age;
            student.tasks = this.tasks;
            return student;
        }
    }
}
