package lesson2.education.Task;

import lesson2.education.TaskValue.AutocheckTaskValue.BoolAutoValue;
import lesson2.education.TaskValue.AutocheckTaskValue.TextAutoValue;
import lesson2.education.TaskValue.TaskValue;
import lesson2.education.TaskValue.TaskValueType;

import java.util.Date;

public class AutoCheckTask extends Task {


    public AutoCheckTask(Date deadlineDate, TaskValueType type) {
        super(deadlineDate, createTaskValue(type));


    }

    public static TaskValue createTaskValue(TaskValueType type) {
        switch (type) {
            case BOOLANSWER -> {
                return new BoolAutoValue();
            }
            case TEXTANSWER -> {
                return new TextAutoValue();
            }
        }
        return null;

    }

}
