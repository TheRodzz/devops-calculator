import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
// comment to check trigger
public class CalculatorTest {
    private Main calculator;

    @Before
    public void setup(){ calculator = new Main(); }

    @Test
    public void test_add_positive()
    {
        double a = 1, b = 2;
        double expec_res = 3;
        double res = calculator.Addition(a, b);
        Assert.assertEquals(expec_res, res, 0.000001);
    }

    @Test
    public void test_add_negative()
    {
        double a = 1, b = 2;
        double expec_res = 0;
        double res = calculator.Addition(a, b);
        Assert.assertNotEquals(expec_res, res);
    }

    @Test
    public void test_sub_positive()
    {
        double a = 2, b = 2;
        double expec_res = 0;
        double res = calculator.Subtraction(a, b);
        Assert.assertEquals(expec_res, res, 0.000001);
    }

    @Test
    public void test_sub_negative()
    {
        double a = 2, b = 2;
        double expec_res = 2;
        double res = calculator.Subtraction(a, b);
        Assert.assertNotEquals(expec_res, res);
    }

    @Test
    public void test_mult_positive()
    {
        double a = 2, b = 3;
        double expec_res = 6;
        double res = calculator.Multiplication(a, b);
        Assert.assertEquals(expec_res, res, 0.000001);
    }

    @Test
    public void test_mult_negative()
    {
        double a = 2, b = 3;
        double expec_res = 1;
        double res = calculator.Multiplication(a, b);
        Assert.assertNotEquals(expec_res, res);
    }

    @Test
    public void test_div_positive()
    {
        double a = 2, b = 2;
        double expec_res = 1;
        double res = calculator.Division(a, b);
        Assert.assertEquals(res, expec_res, 0.000001);
    }

    @Test
    public void test_div_negative()
    {
        double a = 2, b = 2;
        double expec_res = 0;
        double res = calculator.Division(a, b);
        Assert.assertNotEquals(res, expec_res);
    }
}