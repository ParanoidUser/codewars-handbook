import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.ThreadLocalRandom;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class TestSuite {
  @Test
  void sample() {
    assertArrayEquals(
        new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765},
        Utility.generateFibonacciSequence().limit(20).toArray());
  }

  @RepeatedTest(3)
  void random() {
    int[] fib = Utility.generateFibonacciSequence()
        .skip(ThreadLocalRandom.current().nextInt(20, 40)).limit(10).toArray();
    for (int i = 2; i < fib.length; i++) {
      assertEquals(fib[i - 2] + fib[i - 1], fib[i]);
    }
  }
}