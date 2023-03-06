package lesson2;


import lesson2.education.ITaskValue;
import lesson2.education.Mark;
import lesson2.education.Student;
import lesson2.education.Task;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        var student = new Student(1);
        var mark = new Mark(1, 2.0, false);
        var task = new Task(new Date(), new ITaskValue() {});
        task.evaluateTask(mark,new Date());
        student.addTask(task);
        student.calcTotalPoint();
        student.getTotalPoints();
    }
}