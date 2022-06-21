import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals(321, Solution.maxNumber(213));
    assertEquals(9873, Solution.maxNumber(7389));
    assertEquals(97632, Solution.maxNumber(63792));
    assertEquals(977665, Solution.maxNumber(566797));
    assertEquals(9987332, Solution.maxNumber(2399783));
    assertEquals(99997777, Solution.maxNumber(79797979));
    assertEquals(98764321, Solution.maxNumber(17693284));
    assertEquals(98776531, Solution.maxNumber(17758936));
    assertEquals(987665431, Solution.maxNumber(134976658));
  }
}
