import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
  @Test
  void sample() {
    assertEquals(225, Kata.cubeSum(0, 5));
    assertEquals(225, Kata.cubeSum(5, 0));
    assertEquals(27, Kata.cubeSum(2, 3));
    assertEquals(1000000000, Kata.cubeSum(999, 1000));
    assertEquals(1030301, Kata.cubeSum(100, 101));
    assertEquals(10044, Kata.cubeSum(11, 15));
    assertEquals(0, Kata.cubeSum(6, 6));
  }
}
