import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LikeExampleTests {
  @Test
  public void tests() {
    assertTrue(Kata.evalLikes(new String[]{"today", "was", "so", "like", "awesome"}));
    assertFalse(Kata.evalLikes(new String[]{"yesterday", "was", "even", "ummm", "better"}));
  }
}