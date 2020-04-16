import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void testEvenString() {
    assertArrayEquals(new String[] {"ab", "cd", "ef"}, StringSplit.solution("abcdef"));
    assertArrayEquals(new String[] {"He", "ll", "oW", "or", "ld"}, StringSplit.solution("HelloWorld"));
  }

  @Test
  public void testOddString() {
    assertArrayEquals(new String[] {"ab", "cd", "e_"}, StringSplit.solution("abcde"));
    assertArrayEquals(new String[] {"Lo", "ve", "Pi", "zz", "a_"}, StringSplit.solution("LovePizza"));
  }
}
