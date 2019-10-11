import org.junit.Assert;
import org.junit.Test;

public class JUnitTestTocompare {
    
    /** 
     * @throws Exception
     */
    @Test
    public void testCalc() throws Exception{
        Calculator calculator = new Calculator();
        calculator.setNum(0);
        Assert.assertEquals(5.0, calculator.plus(5), 0.1);
        Assert.assertEquals(0.0, calculator.minus(5), 0.1);
        Assert.assertEquals(5.0, calculator.plus(5), 0.1);
        Assert.assertEquals(25.0, calculator.multi(5), 0.1);
        Assert.assertEquals(5.0, calculator.div(5), 0.1);
    }
}
