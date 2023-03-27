package lesson2.education;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import static java.lang.System.*;

@Getter
@AllArgsConstructor
@Builder(setterPrefix = "with", builderMethodName = "privateBuilder")
public class Mark {
    private int value;
    private double rate;
    @NonNull
    protected final boolean isMutable;
    private String comment;


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

    @Deprecated
    private static MarkBuilder builder(boolean value) {
        return privateBuilder().withIsMutable(value);


    }
}