import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(96, Kata.seatsInTheater(16, 11, 5, 3));
    assertEquals(0, Kata.seatsInTheater(1, 1, 1, 1));
    assertEquals(18, Kata.seatsInTheater(13, 6, 8, 3));
    assertEquals(99, Kata.seatsInTheater(60, 100, 60, 1));
    assertEquals(0, Kata.seatsInTheater(1000, 1000, 1000, 1000));
  }
}
