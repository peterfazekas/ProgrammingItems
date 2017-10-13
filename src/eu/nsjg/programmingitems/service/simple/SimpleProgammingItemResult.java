package eu.nsjg.programmingitems.service.simple;

import java.util.List;

public class SimpleProgammingItemResult {

    private static final String NEW_LINE = "\r\n";

    public String printResult(final List<Integer> numbers, final int divisor) {
        StringBuilder sb = new StringBuilder();
        for (SimpleProgrammingItems item : SimpleProgrammingItems.values()) {
            sb.append(item.getDescription());
            try {
                sb.append(item.getStrategy().getResult(numbers, divisor));
            } catch (IllegalArgumentException e) {
                sb.append("Hiba: " + e.getMessage());
            }
            sb.append(NEW_LINE);
        }
        return sb.toString();
    }
}
