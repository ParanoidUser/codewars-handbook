import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    long elapsed = System.currentTimeMillis() + 7000;
    Kata.makeMeSlow();
    assertTrue(System.currentTimeMillis() >= elapsed);
  }

  @Test
  void negative() {
    long elapsed = System.currentTimeMillis() + 100;
    var thread = new Thread(Kata::makeMeSlow);
    thread.start();
    thread.interrupt();
    assertTrue(System.currentTimeMillis() < elapsed);
  }
}