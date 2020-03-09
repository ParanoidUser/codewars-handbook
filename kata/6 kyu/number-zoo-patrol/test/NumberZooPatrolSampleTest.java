import static java.util.concurrent.ThreadLocalRandom.current;
import static java.util.stream.IntStream.rangeClosed;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NumberZooPatrolSampleTest {
  @Rule public Timeout expire = new Timeout(1, TimeUnit.SECONDS);

  @Test
  public void testDescriptionExamples() {
    assertEquals(2, NumberZooPatrol.findMissingNumber(new int[] {1, 3}));
    assertEquals(1, NumberZooPatrol.findMissingNumber(new int[] {2, 3, 4}));
    assertEquals(12, NumberZooPatrol.findMissingNumber(new int[] {13, 11, 10, 3, 2, 1, 4, 5, 6, 9, 7, 8}));
  }

  @Test
  public void testFixed() {
    assertEquals(2, NumberZooPatrol.findMissingNumber(new int[] {1, 3, 4, 5, 6, 7, 8}));
    assertEquals(3, NumberZooPatrol.findMissingNumber(new int[] {7, 8, 1, 2, 4, 5, 6}));
    assertEquals(4, NumberZooPatrol.findMissingNumber(new int[] {1, 2, 3, 5}));
  }

  @Test
  public void testEdge() {
    assertEquals(1, NumberZooPatrol.findMissingNumber(new int[0]));
    assertEquals(2, NumberZooPatrol.findMissingNumber(new int[] {1}));
    assertEquals(1, NumberZooPatrol.findMissingNumber(new int[] {2}));
    assertEquals(13, NumberZooPatrol.findMissingNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}));
  }

  @Test
  public void testPerformanceIsLinear() {
    int million = 1000000, missing = current().nextInt(million);
    int[] numbers = rangeClosed(1, million).filter(i -> i != missing).toArray();

    for (int i = 0; i < 249_999; i++) {
      int temp = numbers[i * 2];
      numbers[i * 2] = numbers[999_997 - i * 2];
      numbers[999_997 - i * 2] = temp;
    }

    for (int i = 0; i < 100; i++) {
      assertEquals(missing, NumberZooPatrol.findMissingNumber(numbers));
    }
  }
}
