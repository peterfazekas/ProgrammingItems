package eu.nsjg.programmingitems.service.simple;

import java.util.List;

public interface SimpleProgrammingItemStrategy {

    default Object getResult(final List<Integer> numbers) {
        return getResult(numbers, 0);
    }
    
    Object getResult(final List<Integer> numbers, final int divisor);
    
}
