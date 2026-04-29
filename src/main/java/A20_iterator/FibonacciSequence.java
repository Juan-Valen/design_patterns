package A20_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FibonacciSequence implements Sequence {

    List<Integer> sequence = new ArrayList<>();

    public FibonacciSequence() {
        sequence.add(1);
        sequence.add(1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(this);
    }

    @Override
    public int size() {
        return sequence.size();
    }

    @Override
    public int get(int index) {
        return sequence.get(index);
    }

    @Override
    public String toString() {
        return sequence.toString();
    }

    protected void generateNext() {
        int size = sequence.size();
        int last = sequence.get(size - 1);
        int second_last = sequence.get(size - 2);

        sequence.add(second_last + last);
    }

}
