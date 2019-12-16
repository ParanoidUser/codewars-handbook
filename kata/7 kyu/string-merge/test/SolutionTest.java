import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void test1() {
    assertEquals("pere", Kata.stringMerge("person", "here", 'e'));
  }

  @Test
  public void test2() {
    assertEquals("apowiejouh", Kata.stringMerge("apowiejfoiajsf", "iwahfeijouh", 'j'));
  }

  @Test
  public void test3() {
    assertEquals("abcdefxxxyyyxyzz", Kata.stringMerge("abcdefxxxyzz", "abcxxxyyyxyzz", 'x'));
  }
}
