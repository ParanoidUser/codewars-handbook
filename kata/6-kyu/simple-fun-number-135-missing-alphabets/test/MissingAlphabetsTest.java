import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MissingAlphabetsTest {
  @Test
  void sample() {
    assertEquals("z", MissingAlphabets.find("abcdefghijklmnopqrstuvwxy"));
    assertEquals("", MissingAlphabets.find("abcdefghijklmnopqrstuvwxyz"));
    assertEquals("zz", MissingAlphabets.find("aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy"));
    assertEquals("ayzz", MissingAlphabets.find("abbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxy"));
    assertEquals("bfghijklmnpqtuvxyz", MissingAlphabets.find("codewars"));
  }
}
