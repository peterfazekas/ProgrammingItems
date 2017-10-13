package eu.nsjg.programmingitems.service.simple;

import java.util.List;

public class MaxIndexCalculate implements SimpleProgrammingItemStrategy {

    @Override
    public Integer getResult(final List<Integer> numbers, final int divisor) {
        int max = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > numbers.get(max)) {
                max = i;
            }
        }
        return max;
    }

}
