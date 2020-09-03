import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(22, SmokingTimmy.startSmoking(0, 1));
    assertEquals(224, SmokingTimmy.startSmoking(1, 0));
    assertEquals(247, SmokingTimmy.startSmoking(1, 1));
    assertEquals(2294, SmokingTimmy.startSmoking(10, 2));
    assertEquals(0, SmokingTimmy.startSmoking(0, 0));
  }
}
