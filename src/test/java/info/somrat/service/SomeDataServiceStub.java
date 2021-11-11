package info.somrat.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import info.somrat.data.SomeDataService;
import org.junit.jupiter.api.Test;

class SomeDataServiceStub implements SomeDataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] { 1, 2, 3 };
    }
}

class SomeDataServiceEmptyStub implements SomeDataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] { };
    }
}

class SomeDataServiceOneElementStub implements SomeDataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] { 5 };
    }
}

class SomeBusinessStubTest {

    @Test
    public void calculateSumUsingDataService_basic() {
        SomeServiceImpl business = new SomeServiceImpl();
        business.setSomeDataService(new SomeDataServiceStub());
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumUsingDataService_empty() {
        SomeServiceImpl business = new SomeServiceImpl();
        business.setSomeDataService(new SomeDataServiceEmptyStub());
        int actualResult = business.calculateSumUsingDataService();//new int[] {}
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumUsingDataService_oneValue() {
        SomeServiceImpl business = new SomeServiceImpl();
        business.setSomeDataService(new SomeDataServiceOneElementStub());
        int actualResult = business.calculateSumUsingDataService();//new int[] { 5 }
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }
}
