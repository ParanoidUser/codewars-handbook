import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScoreTest {
  @Test
  void testInitialValue() {
    Score score = new Score();
    assertEquals(0, score.get());
  }

  @Test
  void testInit() {
    Score score = new Score();
    score.increaseByTen();
    score.init();
    assertEquals(0, score.get());
  }

  @Test
  void testIncreaseByTen() {
    Score score = new Score();
    score.increaseByTen();
    score.increaseByTen();
    score.increaseByTen();
    assertEquals(30, score.get());
  }

  @Test
  void testDecrease() {
    Score score = new Score();
    score.increaseByTen();
    score.decreaseByValue(5);
    assertEquals(5, score.get());
  }

  @Test
  void testNonNegative() {
    Score score = new Score();
    score.increaseByValue(41);
    score.decreaseByValue(42);
    assertEquals(0, score.get());
  }
}