package eu.nsjg.programmingitems.service.simple;

import java.util.List;

public class Find implements SimpleProgrammingItemStrategy {

    @Override
    public Integer getResult(final List<Integer> numbers, final int divisor) {
        if(divisor==0) {
            throw new IllegalArgumentException("Az osztó nem lehet 0!");
        }
        int i = 0;
        
        while (i < numbers.size() && numbers.get(i) % divisor != 0) {
            i++;
        }
        return i < numbers.size() ? i : -1 ;
    }

}
