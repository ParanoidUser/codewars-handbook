import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class KataTests {
  @Test
  public void mean_BasicTest1() {
    assertArrayEquals(new Object[] {3.6, "udiwstagwo"},
        Kata.mean(new char[] {'u', '6', 'd', '1', 'i', 'w', '6', 's', 't', '4', 'a', '6', 'g', '1', '2', 'w', '8', 'o', '2', '0'}));
  }

  @Test
  public void mean_BasicTest2() {
    assertArrayEquals(new Object[] {3., "cxwyvuhinu"},
        Kata.mean(new char[] {'0', 'c', '7', 'x', '6', '2', '3', '5', 'w', '7', '0', 'y', 'v', 'u', 'h', 'i', 'n', 'u', '0', '0'}));
  }

  @Test
  public void mean_BasicTest3() {
    assertArrayEquals(new Object[] {4.3, "uayaqvgydd"},
        Kata.mean(new char[] {'0', 'u', 'a', 'y', '0', 'a', '9', 'q', '3', 'v', 'g', '7', '6', '4', 'y', 'd', '8', '6', '0', 'd'}));
  }

  @Test
  public void mean_BasicTest4() {
    assertArrayEquals(new Object[] {4., "snlmizyzkk"},
        Kata.mean(new char[] {'s', 'n', '9', 'l', '0', 'm', 'i', 'z', '9', '7', 'y', '4', 'z', '3', '3', 'k', '4', '1', '0', 'k'}));
  }

  @Test
  public void mean_BasicTest5() {
    assertArrayEquals(new Object[] {6.1, "vukbgzfuit"},
        Kata.mean(new char[] {'5', 'v', 'u', 'k', '8', '4', '9', 'b', '9', 'g', '5', 'z', '3', 'f', '6', 'u', 'i', '6', '6', 't'}));
  }

  @Test
  public void mean_BasicTest6() {
    assertArrayEquals(new Object[] {.9, "aaddgquvyy"},
        Kata.mean(new char[] {'1', '1', '1', '1', '1', '1', '1', '1', '1', '0', 'a', 'a', 'd', 'd', 'g', 'q', 'u', 'v', 'y', 'y'}));
  }

  @Test
  public void mean_BasicTest7() {
    assertArrayEquals(new Object[] {1., "aaddgquvyy"},
        Kata.mean(new char[] {'1', '1', '1', '1', '1', '1', '1', '1', '1', '1', 'a', 'a', 'd', 'd', 'g', 'q', 'u', 'v', 'y', 'y'}));
  }
}
