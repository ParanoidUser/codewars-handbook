import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final AtomicInteger left = new AtomicInteger();
  private final AtomicInteger right = new AtomicInteger();

  @Test
  void shouldSwipeRightForJavaProgrammer() {
    var profile = new Profile("From Chile. Sushi lover 🍣 Learning Java on codewars.com. Always be yourself. Unless you can be a unicorn, then always be a unicorn 🦄");
    assertSwipe(profile, right);
  }

  @Test
  void shouldSwipeLeftForRustProgrammer() {
    var profile = new Profile("Huge soccer fan ⚽️ Living in Dallas. Rust = ❤️");
    assertSwipe(profile, left);
  }

  private void assertSwipe(Profile profile, AtomicInteger swipes) {
    ProgrammersMacher.rateProfile(profile, left::incrementAndGet, right::incrementAndGet);
    assertEquals(1, left.get() + right.get());
    assertEquals(1, swipes.get());
  }
}