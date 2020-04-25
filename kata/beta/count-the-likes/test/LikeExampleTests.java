import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class LikeExampleTests {
  @Test
  void sample() {
    assertTrue(Kata.evalLikes(new String[]{"today", "was", "so", "like", "awesome"}));
    assertFalse(Kata.evalLikes(new String[]{"yesterday", "was", "even", "ummm", "better"}));
  }
}