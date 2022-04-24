import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, Kata.getParticipants(0));
    assertEquals(2, Kata.getParticipants(1));
    assertEquals(3, Kata.getParticipants(3));
    assertEquals(4, Kata.getParticipants(6));
    assertEquals(5, Kata.getParticipants(7));
  }
}