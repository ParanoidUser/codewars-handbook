import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoolTest {
  @Test
  public void testBoolToWord() {
    assertEquals(YesOrNo.boolToWord(true), "Yes");
    assertEquals(YesOrNo.boolToWord(false), "No");
  }
}
