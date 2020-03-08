import static java.util.stream.IntStream.range;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.ThreadLocalRandom;

import org.junit.Test;

public class NumberZooPatrolSampleTest {
  @Test
  public void testDescriptionExamples() {
    assertEquals(2, NumberZooPatrol.findMissingNumber(new int[] {1, 3}));
    assertEquals(1, NumberZooPatrol.findMissingNumber(new int[] {2, 3, 4}));
    assertEquals(12, NumberZooPatrol.findMissingNumber(new int[] {13, 11, 10, 3, 2, 1, 4, 5, 6, 9, 7, 8}));
  }

  @Test(timeout = 1000)
  public void testPerformanceIsLinear() {
    var million = range(1, 1000000).toArray();
    for (int i = 0; i < 100; i++) {
      var copy = million.clone();
      int missing = ThreadLocalRandom.current().nextInt(1000000);
      copy[missing] = 1000000;
      assertEquals(missing + 1, NumberZooPatrol.findMissingNumber(copy));
    }
  }
}
