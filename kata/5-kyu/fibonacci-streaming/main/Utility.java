import static java.util.stream.Stream.iterate;
import java.util.stream.IntStream;

interface Utility {
  static IntStream generateFibonacciSequence() {
    return iterate(new int[]{1, 1}, i -> new int[]{i[1], i[0] + i[1]}).mapToInt(i -> i[0]);
  }
}