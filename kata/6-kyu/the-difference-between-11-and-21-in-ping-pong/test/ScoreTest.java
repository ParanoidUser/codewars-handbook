import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class ScoreTest {
  @Test
  void equalsTest() {
    var score = new Score(1,1);
    assertEquals(score, score);
    assertEquals(score, new Score(1, 1));
    assertNotEquals(score, new Score(1, 2));
    assertNotEquals(score, new Score(2, 1));
    assertNotEquals(score, new Object());
    assertNotEquals(score, null);
  }

  @Test
  void hashCodeTest() {
    assertEquals(994, new Score(1, 2).hashCode());
    assertEquals(1024, new Score(2, 1).hashCode());
    assertNotEquals(3600, new Score(1, 2).hashCode());
    assertNotEquals(3542, new Score(2, 1).hashCode());
  }

  @Test
  void toStringTest() {
    assertEquals("Score(me=1, opponent=1)", new Score(1, 1).toString());
  }
}