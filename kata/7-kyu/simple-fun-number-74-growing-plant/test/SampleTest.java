import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals(10, SimpleFun.growingPlant(100, 10, 910));
    assertEquals(1, SimpleFun.growingPlant(10, 9, 4));
  }
}
