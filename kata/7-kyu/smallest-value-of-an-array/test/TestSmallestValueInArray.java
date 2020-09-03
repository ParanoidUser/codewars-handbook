import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestSmallestValueInArray {
  @Test
  void sample() {
    assertEquals(0, Arrays.findSmallest(new int[]{1, 2, 3}, "index"));
    assertEquals(2, Arrays.findSmallest(new int[]{7, 12, 3, 2, 27}, "value"));
    assertEquals(3, Arrays.findSmallest(new int[]{7, 12, 3, 2, 27}, "index"));
  }
}
