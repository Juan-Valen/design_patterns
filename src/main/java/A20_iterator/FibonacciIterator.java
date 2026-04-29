package A20_iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

    private FibonacciSequence sequence;
    private int index;

    public FibonacciIterator(FibonacciSequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean hasNext() {
        return index != sequence.size();
    }

    @Override
    public Integer next() {
        index++;
        if (!hasNext()) {
            sequence.generateNext();
        }
        return sequence.get(index);
    }
}
