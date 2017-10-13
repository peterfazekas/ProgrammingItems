package eu.nsjg.programmingitems.service.simple;

import java.util.List;

public class MaxValueCalculate implements SimpleProgrammingItemStrategy {

    @Override
    public Integer getResult(final List<Integer> numbers, final int divisor) {
        int max = Integer.MIN_VALUE;
        for (Integer item : numbers) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

}
