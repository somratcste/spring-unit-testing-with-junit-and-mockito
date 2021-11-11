package info.somrat.service;

import info.somrat.data.SomeDataService;
import java.util.Arrays;

public class SomeServiceImpl {

    private SomeDataService someDataService;

    public SomeDataService getSomeDataService() {
        return someDataService;
    }

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    public int calculateSum(int[] data) {
        return Arrays.stream(data).sum();
    }

    public int calculateSumUsingDataService() {
        int[] data = someDataService.retrieveAllData();
        //someDataService.storeSum(sum);
        return Arrays.stream(data).reduce(Integer::sum).orElse(0);
    }
}
