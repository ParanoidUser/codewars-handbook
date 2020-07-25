import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SubstringTest {
  @Test
  void sample() {
    assertEquals(8, FindSubstring.longestSubstring("preface", "singularity"));
    assertEquals(5, FindSubstring.longestSubstring(" 8684Hh", "7575H--8---"));
    assertEquals(3, FindSubstring.longestSubstring("looking", "zoology"));
  }
}
