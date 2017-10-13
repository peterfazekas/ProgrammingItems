package eu.nsjg.programmingitems.service.simple;

import java.util.List;

public class Calculate implements SimpleProgrammingItemStrategy{

    @Override
    public Integer getResult(final List<Integer> numbers, final int divisor) {
        int sum = 0;
        for (Integer item : numbers) {
            sum += item;
        }
        return sum;
    }

}
