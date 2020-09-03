import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, TheOffice.meeting(new char[] {'X', 'O', 'X'}));
    assertEquals(0, TheOffice.meeting(new char[] {'O', 'X', 'X', 'X', 'X'}));
    assertEquals(2, TheOffice.meeting(new char[] {'X', 'X', 'O', 'X', 'X'}));
    assertEquals("None available!", TheOffice.meeting(new char[] {'X', 'X', 'X', 'X', 'X'}));
  }
}
