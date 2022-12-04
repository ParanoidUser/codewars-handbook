import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(2, StringCounter.stringCounter("Hello World", 'o'));
    assertEquals(4, StringCounter.stringCounter("Wait isn't it supposed to be cynical?", 'i'));
    assertEquals(4, StringCounter.stringCounter("I'm gona be the best code warrior ever dad", 'r'));
    assertEquals(1, StringCounter.stringCounter("Do you like Harry Potter?", '?'));
  }
}
