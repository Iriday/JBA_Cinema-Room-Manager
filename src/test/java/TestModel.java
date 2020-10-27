import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestModel {
    @Test
    public void testCalcIncome() {
        assertEquals(Model.calcIncome(10, 10, 10, 10), 1000, 0);
        assertEquals(Model.calcIncome(3, 3, 1, 1), 9, 0);
        assertEquals(Model.calcIncome(29, 2, 2, 2), 116, 0);

        assertEquals(Model.calcIncome(10, 10, 10, 8), 900, 0);
        assertEquals(Model.calcIncome(11, 10, 10, 8), 980, 0);
    }
}