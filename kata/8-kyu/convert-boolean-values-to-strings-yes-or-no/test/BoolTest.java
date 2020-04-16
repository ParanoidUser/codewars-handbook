import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoolTest {
  @Test
  public void testBoolToWord() {
    assertEquals("Yes", YesOrNo.boolToWord(true));
    assertEquals("No", YesOrNo.boolToWord(false));
  }
}
