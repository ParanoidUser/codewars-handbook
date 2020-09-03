import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GapMinderTest {
  @Test
  void sample() {
    assertEquals(0, TrainInspector.countMissingCarriages("ABC"));
    assertEquals(1, TrainInspector.countMissingCarriages("ABD"));
  }
}