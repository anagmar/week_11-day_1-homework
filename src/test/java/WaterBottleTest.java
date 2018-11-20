import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void doesItDecreases(){
        assertEquals(90, waterBottle.decreaseDrink());
    }

    @Test
    public void emptyBottle(){
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void fillBottle(){
        assertEquals(100, waterBottle.fillBottle());
    }


}
