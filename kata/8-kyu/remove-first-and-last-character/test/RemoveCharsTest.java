import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveCharsTest {
  @Test
  void sample() {
    assertEquals("loquen", RemoveChars.remove("eloquent"));
    assertEquals("ountr", RemoveChars.remove("country"));
    assertEquals("erso", RemoveChars.remove("person"));
    assertEquals("lac", RemoveChars.remove("place"));
  }
}
