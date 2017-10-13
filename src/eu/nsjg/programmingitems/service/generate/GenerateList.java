package eu.nsjg.programmingitems.service.generate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateList {
    private static final int BOUND = 100;
    
    private final Random random;
    
    public GenerateList(final Random random) {
        this.random = random;
    }

    public List<Integer> generate() {
        return generate(BOUND, 0, BOUND);
    }

    public List<Integer> generate(final int count) {
        return generate(count, 0, BOUND);
    }

    public List<Integer> generate(final int count, final int hi) {
        return generate(count, 0, hi);
    }

    
    public List<Integer> generate(final int count, final int lo, final int hi) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(hi - lo) + lo);
        }
        return numbers;
    }
}
