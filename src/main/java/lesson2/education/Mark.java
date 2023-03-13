package lesson2.education;

import static java.lang.System.*;

public class Mark {
    private int value;
    private double rate;
    public final boolean isMutable;
    private String comment;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (isMutable)
            this.value = value;
        else out.print("This field is immutable");
    }


    public Mark(int value, double rate, boolean isMutable) {
        this.value = value;
        this.rate = rate;
        this.isMutable = isMutable;
    }

    public double getScore() {
        return rate * value;
    }


    public static final class MarkBuilder {
        private int value;
        private double rate;
        private boolean isMutable;
        private String comment;

        public MarkBuilder(int value, double rate, boolean isMutable) {
            this.value = value;
            this.rate = rate;
            this.isMutable = isMutable;
        }

        public MarkBuilder withComment(String comment) {
            this.comment = comment;
            return this;
        }

        public Mark build() {
            Mark mark = new Mark(value, rate, isMutable);
            mark.comment = this.comment;
            return mark;
        }
    }
}
