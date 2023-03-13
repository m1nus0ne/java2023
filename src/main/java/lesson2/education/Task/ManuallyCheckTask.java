package lesson2.education.Task;

import lesson2.education.TaskValue.TaskValue;
import lesson2.education.TaskValue.ManuallyCheckTaskValue.BoolManualValue;
import lesson2.education.TaskValue.ManuallyCheckTaskValue.TextManualValue;
import lesson2.education.TaskValue.TaskValueType;

import java.util.Date;

public class ManuallyCheckTask extends Task {


    public ManuallyCheckTask(Date deadlineDate, TaskValueType type) {
        super(deadlineDate, createTaskValue(type));


    }

    public static TaskValue createTaskValue(TaskValueType type) {
        switch (type) {
            case BOOLANSWER -> {
                return new BoolManualValue();
            }
            case TEXTANSWER -> {
                return new TextManualValue();
            }
        }
        return null;

    }

}