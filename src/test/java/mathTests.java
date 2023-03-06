import lesson2.Math;
import org.junit.Assert;
import org.junit.Test;


public class mathTests {
    @Test
    public void signTest(){
        var exp1 = '-';
        var exp2 = '+';
        Assert.assertEquals(Math.sign(-12),exp1);
        Assert.assertEquals(Math.sign(12),exp2);
    }
    @Test
    public void factTests(){

    }
}
