package eu.nsjg.programmingitems.service.simple;

import java.util.List;

public class Count implements SimpleProgrammingItemStrategy {

    @Override
    public Integer getResult(final List<Integer> numbers, final int divisor) throws IllegalArgumentException {
        if(divisor==0) {
            throw new IllegalArgumentException("Az osztó nem lehet 0!");
        }
        int count = 0;
        for (Integer item : numbers) {
            if(item % divisor != 0) {
                count++;
            }
        }
        return count;
    }

}
