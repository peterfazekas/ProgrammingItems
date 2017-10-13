package eu.nsjg.programmingitems.service.complex;

import java.util.List;

public abstract class ComplexProgrammingItemStrategy {

    protected final Integer[] numbers;
    
    public ComplexProgrammingItemStrategy(final List<Integer> numbers) {
        this.numbers = numbers.toArray(new Integer[numbers.size()]);
    }

    abstract public List<Integer> sort();
    
    protected boolean greater(final int i, final int j) {
        return numbers[i] > numbers[j];
    }
    
    protected void swap(final int i, final int j) {
        int p = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = p;
    }

}
