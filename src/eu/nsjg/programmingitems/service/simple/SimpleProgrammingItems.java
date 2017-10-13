package eu.nsjg.programmingitems.service.simple;

public enum SimpleProgrammingItems {

    CALCULATE("Sorozatsz�m�t�s: ", new Calculate()),
    DECIDE("Eld�nt�s: ", new Decide()),
    SELECT("Kiv�laszt�s: ", new Select()),
    FIND("Keres�s: ", new Find()),
    COUNT("Darabsz�m: ", new Count()),
    MAX_INDEX("Legnagyobb index: ",  new MaxIndexCalculate()),
    MAX_VALUE("Legnagyobb �rt�k: ", new MaxValueCalculate());
    
    private final String description;
    private final SimpleProgrammingItemStrategy strategy;
    
    private SimpleProgrammingItems(final String text, final SimpleProgrammingItemStrategy strategy) {
        this.description = text;
        this.strategy = strategy;
    }
    
    public String getDescription() {
        return description;
    }

    public SimpleProgrammingItemStrategy getStrategy() {
        return strategy;
    }
    
}
