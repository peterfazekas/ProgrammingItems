package eu.nsjg.programmingitems.service.simple;

public enum SimpleProgrammingItems {

    CALCULATE("Sorozatszámítás: ", new Calculate()),
    DECIDE("Eldöntés: ", new Decide()),
    SELECT("Kiválasztás: ", new Select()),
    FIND("Keresés: ", new Find()),
    COUNT("Darabszám: ", new Count()),
    MAX_INDEX("Legnagyobb index: ",  new MaxIndexCalculate()),
    MAX_VALUE("Legnagyobb érték: ", new MaxValueCalculate());
    
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
