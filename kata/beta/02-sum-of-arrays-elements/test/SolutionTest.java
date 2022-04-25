import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(30, LearningJava.sum(new int[]{8, 5, 4}));
    assertEquals(22, LearningJava.sum(new int[]{4, 9}));
    assertEquals(35, LearningJava.sum(new int[]{5, 4, 3, 2, 1}));
  }
}
