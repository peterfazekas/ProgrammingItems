package eu.nsjg.programmingitems.service.complex;

import java.util.Arrays;
import java.util.List;

public class BubbleSort extends ComplexProgrammingItemStrategy {

    public BubbleSort(final List<Integer> numbers) {
        super(numbers);
    }

    @Override
    public List<Integer> sort() {
        for (int i = numbers.length; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if(greater(j, j + 1)) {
                    swap(j, j + 1);
                }
            }
        }
        return Arrays.asList(numbers);
    }
}
