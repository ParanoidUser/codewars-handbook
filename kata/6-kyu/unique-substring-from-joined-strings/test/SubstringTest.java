import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubstringTest {
  @Test
  public void test() {
    assertEquals("Example test 1", 8, FindSubstring.longestSubstring("preface", "singularity"));
    assertEquals("Example test 2", 5, FindSubstring.longestSubstring(" 8684Hh", "7575H--8---"));
    assertEquals("Example test 3", 3, FindSubstring.longestSubstring("looking", "zoology"));
  }
}
