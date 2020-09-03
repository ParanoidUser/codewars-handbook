import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class NewAverageTest {
  @Test
  void sample() {
    assertEquals(628, NewAverage.newAvg(new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90));
    assertEquals(645, NewAverage.newAvg(new double[]{14, 30, 5, 7, 9, 11, 15}, 92));
    assertThrows(IllegalArgumentException.class, () -> NewAverage.newAvg(new double[]{14, 30, 5, 7, 9, 11, 15}, 2));
  }
}
