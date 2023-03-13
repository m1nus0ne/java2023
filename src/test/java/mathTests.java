import lesson2.Math;
import org.junit.Assert;
import org.junit.Test;


public class mathTests {
    @Test
    public void signTest() {
        var exp1 = '-';
        var exp2 = '+';
        Assert.assertEquals(Math.sign(-12), exp1);
        Assert.assertEquals(Math.sign(12), exp2);
    }

    @Test
    public void factTests() {
        var input = new int[] {4,6,7,8};
        var expected = new int[] {24,720,5040,40320};
        for (int i = 0; i < input.length; i++) {
            Assert.assertEquals(expected[i],Math.fact(input[i]));
        }

    }


}

