import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimesGenerator implements Iterable<Integer> {
    private final List<Integer> primes = new ArrayList<>();

    public PrimesGenerator(int n) {
        generatePrimes(n);
    }

    private boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    private void generatePrimes(int count) {
        int number = 2;
        while (primes.size() < count) {
            if (isPrime(number)) {
                primes.add(number);
            }
            number++;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return primes.iterator();
    }

    public Iterator<Integer> reverseIterator() {
        return new Iterator<>() {
            private int index = primes.size() - 1;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Integer next() {
                return primes.get(index--);
            }
        };
    }
}