package lesson2.education;

import java.util.Date;

import static java.lang.System.out;

public class Task {
    private Mark mark;

    private Date deadlineDate;

    private Date compliteDate;
    private ITaskValue value;

    public Mark getMark() {
        return mark;
    }

    public Task(Date deadlineDate, ITaskValue value) {
        this.mark = null;
        this.compliteDate = null;
        this.deadlineDate = deadlineDate;
        this.value = value;
    }

    public void evaluateTask(Mark mark, Date compliteDate) {
        if (this.mark == null || !mark.isMutable) {
            if (!this.deadlineDate.before(compliteDate)) {
                this.mark = mark;
                this.compliteDate = compliteDate;
            } else out.print("Now you cant edit this field");
        }


    }
}
