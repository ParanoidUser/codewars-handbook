import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class KataTest {
  @Test
  public void shouldBeTrue() {
    assertTrue(Kata.SubstringTest("Something", "Home"));
  }

  @Test
  public void shouldBeFalse() {
    assertFalse(Kata.SubstringTest("Something", "Fun"));
  }
}
