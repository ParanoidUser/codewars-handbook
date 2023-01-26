import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void shouldSwipeRightForJavaProgrammer() {
    var profile = new Profile(
      "Julia Green",
      24,
      "From Chile. Sushi lover 🍣 Learning Java on codewars.com. Always be yourself. Unless you can be a unicorn, then always be a unicorn 🦄"
    );
    
    assertSwipe(profile, "right");
  }
  
  @Test
  void shouldSwipeLeftForRustProgrammer() {
    var profile = new Profile(
      "Peter Parker",
      31,
      "Huge soccer fan ⚽️ Living in Dallas. Rust = ❤️"
    );
    
    assertSwipe(profile, "left");
  }
  
  private void assertSwipe(Profile profile, String direction) {
    var left = new CallCounter();
    var right = new CallCounter();
    
    ProgrammersMacher.rateProfile(profile, left::call, right::call);
    
    assertTrue(left.getCalls() + right.getCalls() > 0, "No call was made. Please either call swipeLeft.execute() or swipeRight.execute()");
    if ("left".equals(direction)) {
      assertEquals(1, left.getCalls(), String.format("Expected 1 call to swipeLeft, but got %d", left.getCalls()));
      assertEquals(0, right.getCalls(), String.format("Expected no calls to swipeRight, but got %d", right.getCalls()));
    } else {
      assertEquals(0, left.getCalls(), String.format("Expected no calls to swipeLeft, but got %d", left.getCalls()));
      assertEquals(1, right.getCalls(), String.format("Expected 1 call to swipeRight, but got %d", right.getCalls()));
    }
  }
  
  private static class CallCounter {
    private int calls = 0;
    
    public void call() {
      this.calls++;
    }
    
    public int getCalls() {
      return this.calls;
    }
  }
}