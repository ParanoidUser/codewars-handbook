import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Steps.step(0, 0));
    assertEquals(0, Steps.step(45, 45));
    assertEquals(1, Steps.step(45, 46));
    assertEquals(2, Steps.step(45, 47));
    assertEquals(3, Steps.step(45, 48));
    assertEquals(3, Steps.step(45, 49));
    assertEquals(4, Steps.step(45, 50));
    assertEquals(4, Steps.step(45, 51));
    assertEquals(5, Steps.step(45, 52));
    assertEquals(5, Steps.step(45, 53));
    assertEquals(5, Steps.step(45, 54));
    assertEquals(6, Steps.step(45, 55));
    assertEquals(6, Steps.step(45, 56));
    assertEquals(6, Steps.step(45, 57));
    assertEquals(7, Steps.step(45, 58));
    assertEquals(8, Steps.step(45, 62));
    assertEquals(9, Steps.step(45, 66));
    assertEquals(10, Steps.step(45, 71));
    assertEquals(92681, Steps.step(1, Integer.MAX_VALUE));
  }
}