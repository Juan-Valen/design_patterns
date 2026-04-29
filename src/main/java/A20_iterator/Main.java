package A20_iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        FibonacciSequence sequence = new FibonacciSequence();
        Iterator<Integer> it = sequence.iterator();

        // Print the first 15 Fibonacci numbers
        for (int i = 0; i < 15; i++) {
            if (it.hasNext()) {
                System.out.println(it.next());
            }
        }

        // Show the underlying sequence list after iteration
        System.out.println("Final sequence: " + sequence);
    }
}
