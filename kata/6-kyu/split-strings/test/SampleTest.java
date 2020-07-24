import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringSplit.solution("abcdef"));
    assertArrayEquals(new String[]{"He", "ll", "oW", "or", "ld"}, StringSplit.solution("HelloWorld"));
    assertArrayEquals(new String[]{"ab", "cd", "e_"}, StringSplit.solution("abcde"));
    assertArrayEquals(new String[]{"Lo", "ve", "Pi", "zz", "a_"}, StringSplit.solution("LovePizza"));
  }
}
