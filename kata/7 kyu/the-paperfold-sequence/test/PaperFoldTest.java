import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PaperFoldTest {
  @Test
  public void testWithTwenty() {
    PaperFold p = new PaperFold();
    int[] testArray = {1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1};
    for (int i = 0; i < 20; i++) {
      assertEquals("Element " + (i + 1), testArray[i], p.getAsInt());
    }
  }
}
