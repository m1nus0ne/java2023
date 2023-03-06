package lesson2.education;

import static java.lang.System.*;

public class Mark {
    private int value;
    public double rate;
    public boolean isMutable;

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

}
