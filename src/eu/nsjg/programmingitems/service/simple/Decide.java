package eu.nsjg.programmingitems.service.simple;

import java.util.List;

public class Decide implements SimpleProgrammingItemStrategy {

    @Override
    public Boolean getResult(final List<Integer> numbers, final int divisor) throws IllegalArgumentException {
        if(divisor==0) {
            throw new IllegalArgumentException("Az osztó nem lehet 0!");
        }
        int i = 0;
        while (i < numbers.size() && numbers.get(i) % divisor != 0) {
            i++;
        }
        return i < numbers.size();
    }

}
