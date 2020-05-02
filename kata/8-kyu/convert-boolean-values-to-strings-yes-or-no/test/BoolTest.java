import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BoolTest {
  @Test
  void sample() {
    assertEquals("Yes", YesOrNo.boolToWord(true));
    assertEquals("No", YesOrNo.boolToWord(false));
  }
}
