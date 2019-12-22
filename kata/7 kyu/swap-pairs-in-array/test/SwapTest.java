import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SwapTest {
  @Test
  public void test1() {
    Integer[][] test1 = {{0, 0}, {1, 1}};
    Integer[][][] sol1 = {{{0, 0}, {1, 1}}, {{0, 0}, {1, 1}}};
    assertArrayEquals("Test1:", sol1, Swappairs.swapp(test1));
  }

  @Test
  public void test2() {
    Integer[][] test2 = {{1, 0}, {0, 1}};
    Integer[][][] sol2 = {{{1, 0}, {0, 1}}, {{0, 1}, {1, 0}}};
    assertArrayEquals("Test2:", sol2, Swappairs.swapp(test2));
  }

  @Test
  public void test3() {
    String[][] test3 = {{"aa", "bb"}, {"abc", "def"}};
    String[][][] sol3 = {{{"aa", "bb"}, {"abc", "def"}}, {{"bb", "aa"}, {"def", "abc"}}};
    assertArrayEquals("Test3:", sol3, Swappairs.swapp(test3));
  }
}
