import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MinNbDivTest {
  @Test
  void sample() {
    assertEquals(1, MinNbDiv.findMinNum(1));
    assertEquals(12, MinNbDiv.findMinNum(6));
    assertEquals(64, MinNbDiv.findMinNum(7));
    assertEquals(24, MinNbDiv.findMinNum(8));
    assertEquals(36, MinNbDiv.findMinNum(9));
  }
}
