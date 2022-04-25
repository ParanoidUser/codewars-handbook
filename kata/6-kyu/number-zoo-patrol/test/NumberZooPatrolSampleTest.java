import static java.util.stream.IntStream.rangeClosed;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.security.SecureRandom;
import org.junit.jupiter.api.Test;

class NumberZooPatrolSampleTest {
  @Test
  void sample() {
    assertEquals(1, NumberZooPatrol.findMissingNumber(new int[0]));
    assertEquals(2, NumberZooPatrol.findMissingNumber(new int[]{1}));
    assertEquals(1, NumberZooPatrol.findMissingNumber(new int[]{2}));
    assertEquals(2, NumberZooPatrol.findMissingNumber(new int[]{1, 3}));
    assertEquals(1, NumberZooPatrol.findMissingNumber(new int[]{2, 3, 4}));
    assertEquals(4, NumberZooPatrol.findMissingNumber(new int[]{1, 2, 3, 5}));
    assertEquals(2, NumberZooPatrol.findMissingNumber(new int[]{1, 3, 4, 5, 6, 7, 8}));
    assertEquals(3, NumberZooPatrol.findMissingNumber(new int[]{7, 8, 1, 2, 4, 5, 6}));
    assertEquals(12, NumberZooPatrol.findMissingNumber(new int[]{13, 11, 10, 3, 2, 1, 4, 5, 6, 9, 7, 8}));
    assertEquals(13, NumberZooPatrol.findMissingNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}));
  }

  @Test
  void testPerformanceIsLinear() {
    int million = 1000000, missing = new SecureRandom().nextInt(million);
    int[] numbers = rangeClosed(1, million).parallel().filter(i -> i != missing).toArray();

    for (int i = 0; i < 100; i++) {
      assertEquals(missing, NumberZooPatrol.findMissingNumber(numbers));
    }
  }
}
