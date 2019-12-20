import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void test1() {
    int[] array = {1, 2};
    assertEquals("yes, ascending", Solution.isSortedAndHow(array));
  }

  @Test
  public void test2() {
    int[] array = {15, 7, 3, -8};
    assertEquals("yes, descending", Solution.isSortedAndHow(array));
  }

  @Test
  public void test3() {
    int[] array = {4, 2, 30};
    assertEquals("no", Solution.isSortedAndHow(array));
  }

  @Test
  public void test4() {
    int[] array = {-9999, -9999};
    assertEquals("yes, ascending", Solution.isSortedAndHow(array));
  }
}
