import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(8,2);
    }

    @Test
    public void itAdds(){
        assertEquals(10.0, calculator.add());
    }

    @Test
    public void itSubstracts(){
        assertEquals(6.0, calculator.subtract());
    }

    @Test
    public void itMultiplies(){
        assertEquals(16.0, calculator.multiply());
    }

    @Test
    public void itDevides(){
        assertEquals(4.0, calculator.divide());
    }







}
