package lesson2.education.Task;

import lesson2.education.Mark;
import lesson2.education.TaskValue.TaskValue;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

import static java.lang.System.out;

@Getter
@Builder(setterPrefix = "with", builderMethodName = "privateBuilder")
public abstract class Task {
    private Mark mark;

    private Date deadlineDate;

    private Date compliteDate;
    protected TaskValue value;


    public Task(Date deadlineDate, TaskValue value) {
        this.mark = null;
        this.compliteDate = null;
        this.deadlineDate = deadlineDate;
        this.value = value;
    }

    public void evaluateTask(Mark mark, Date compliteDate) {
        if (this.mark == null || !mark.isMutable()) {
            if (!this.deadlineDate.before(compliteDate)) {
                this.mark = mark;
                this.compliteDate = compliteDate;
            } else out.print("Now you cant edit this field");
        }


    }

    @Deprecated
    private static TaskBuilder builder(TaskValue value) {
        return privateBuilder().withValue(value);
    }
}
