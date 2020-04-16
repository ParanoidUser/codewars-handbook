import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SequenceTest {
  @Test
  public void basicTests() {
    assertEquals(50, Sequence.getScore(1));
    assertEquals(150, Sequence.getScore(2));
    assertEquals(300, Sequence.getScore(3));
    assertEquals(500, Sequence.getScore(4));
    assertEquals(750, Sequence.getScore(5));
  }
}
