import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class ScoreTest {
  @Test
  void equalsTest() {
    var score = new Score(1,1);
    assertEquals(score, score);
    assertEquals(score, new Score(1, 1));
    assertNotEquals(score, new Score(1, 2));
    assertNotEquals(score, new Object());
    assertFalse(score.equals(null));
  }

  @Test
  void hashCodeTest() {
    assertEquals(3541, new Score(1, 1).hashCode());
  }

  @Test
  void toStringTest() {
    assertEquals("Score(me=1, opponent=1)", new Score(1, 1).toString());
  }
}