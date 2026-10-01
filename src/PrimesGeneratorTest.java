import java.util.Iterator;

public class PrimesGeneratorTest {
    public static void main(String[] args) {
        int n = 10; // кол-во простых чисел
        PrimesGenerator generator = new PrimesGenerator(n);

        System.out.println("Простые числа в прямом порядке:");
        for (Integer prime : generator) {
            System.out.print(prime + " ");
        }
        System.out.println();

        System.out.println("Простые числа в обратном порядке:");
        Iterator<Integer> reverseIt = generator.reverseIterator();
        while (reverseIt.hasNext()) {
            System.out.print(reverseIt.next() + " ");
        }
        System.out.println();
    }
}