package eu.nsjg.programmingitems;

import java.util.List;
import java.util.Random;

import eu.nsjg.programmingitems.service.complex.BubbleSort;
import eu.nsjg.programmingitems.service.complex.ComplexProgrammingItemStrategy;
import eu.nsjg.programmingitems.service.complex.SingleShuffleSort;
import eu.nsjg.programmingitems.service.generate.GenerateList;
import eu.nsjg.programmingitems.service.simple.SimpleProgammingItemResult;

public class App {

    private final List<Integer> numbers;
    private final GenerateList value;
    private final SimpleProgammingItemResult simpleProgrammingItemStrategy; 
    
    public App() {
        value = new GenerateList(new Random());
        simpleProgrammingItemStrategy = new SimpleProgammingItemResult();
        numbers = value.generate();
    }

    public static void main(String[] args) {
        App app = new App();
        app.print();
    }
    
    private void print() {
        System.out.println("Jelenleg a lista " + numbers.size() + " elemû.");
        System.out.println("Elemei: " + numbers);
        System.out.println(simpleProgrammingItemStrategy.printResult(numbers, 0));
        System.out.println("------------");
        System.out.println("Elemei: " + numbers);
        ComplexProgrammingItemStrategy complex = new SingleShuffleSort(numbers); 
        System.out.println("Elemei: " + complex.sort());
        System.out.println("------------");
        System.out.println("Elemei: " + numbers);
        complex = new BubbleSort(numbers); 
        System.out.println("Elemei: " + complex.sort());
    }

}
