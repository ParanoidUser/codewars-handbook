import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PythagoreanTripleTest {
  @Test
  public void validTriple() {
    assertEquals(1, PythagoreanTriple.pythagoreanTriple(new int[] {3, 4, 5}));
  }

  @Test
  public void invalidTriple() {
    assertEquals(0, PythagoreanTriple.pythagoreanTriple(new int[] {3, 5, 7}));
  }
}
