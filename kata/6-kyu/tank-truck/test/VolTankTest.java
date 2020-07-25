import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VolTankTest {
  @Test
  void sample() {
    assertEquals(2940, VolTank.tankVol(5, 7, 3848));
    assertEquals(907, VolTank.tankVol(2, 7, 3848));
  }
}
