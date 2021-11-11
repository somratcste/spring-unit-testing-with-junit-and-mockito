package info.somrat.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SomeBusinessTest {

    @Test
    public void calculateSum_basic() {
        SomeServiceImpl business = new SomeServiceImpl();
        int actualResult = business.calculateSum(new int[] {1, 2, 3});
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_empty() {
        SomeServiceImpl business = new SomeServiceImpl();
        int actualResult = business.calculateSum(new int[] { });
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_oneValue() {
        SomeServiceImpl business = new SomeServiceImpl();
        int actualResult = business.calculateSum(new int[] { 5});
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }
}
