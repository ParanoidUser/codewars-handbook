import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, Kata.GetParticipants(0));
    assertEquals(2, Kata.GetParticipants(1));
    assertEquals(3, Kata.GetParticipants(3));
    assertEquals(4, Kata.GetParticipants(6));
    assertEquals(5, Kata.GetParticipants(7));
  }
}