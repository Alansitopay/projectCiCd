import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
    @Test
    public void testSuma(){
        Calculadora calc = new Calculadora();
        Assert.assertEquals(calc.sumar(2,3),5);
    }
}
