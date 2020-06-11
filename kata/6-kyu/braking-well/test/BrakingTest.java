import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BrakingTest {
  @Test
  void distTest() {
    assertEquals(311.83146449201496, Braking.dist(144, 0.3), 1e-2);
    assertEquals(92.12909477605366, Braking.dist(92, 0.5), 1e-2);
    assertEquals(435.94398509960854, Braking.dist(142, 0.2), 1e-2);
    assertEquals(207.8876429946766, Braking.dist(96, 0.2), 1e-2);
  }

  @Test
  void speedTest() {
    assertEquals(153.79671564846308, Braking.speed(159, 0.8), 1e-2);
    assertEquals(147.91115701756493, Braking.speed(164, 0.7), 1e-2);
    assertEquals(142.14404997566152, Braking.speed(153, 0.7), 1e-2);
    assertEquals(113.64202099481099, Braking.speed(88, 0.9), 1e-2);
  }
}
