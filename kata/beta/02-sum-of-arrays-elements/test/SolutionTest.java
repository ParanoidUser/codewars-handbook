import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertEquals(30, LearningJava.Sum1(new int[]{8, 5, 4}));
    assertEquals(22, LearningJava.Sum1(new int[]{4, 9}));
    assertEquals(35, LearningJava.Sum1(new int[]{5, 4, 3, 2, 1}));
  }
}
