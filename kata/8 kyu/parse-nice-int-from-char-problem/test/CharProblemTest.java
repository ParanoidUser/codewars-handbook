import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharProblemTest {
  @Test
  public void test1() {
    assertEquals(5, CharProblem.howOld("5 years old"));
  }

  @Test
  public void test2() {
    assertEquals(9, CharProblem.howOld("9 years old"));
  }

  @Test
  public void test3() {
    assertEquals(1, CharProblem.howOld("1 year old"));
  }
}
