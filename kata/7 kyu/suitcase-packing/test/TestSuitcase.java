import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestSuitcase {
  @Test
  public void fixed_test() {
    assertTrue(MrSquare.fit_in(1, 2, 3, 2));
    assertFalse(MrSquare.fit_in(1, 2, 2, 1));
    assertFalse(MrSquare.fit_in(3, 2, 3, 2));
    assertFalse(MrSquare.fit_in(1, 2, 1, 2));
    assertFalse(MrSquare.fit_in(6, 5, 8, 7));
  }
}
