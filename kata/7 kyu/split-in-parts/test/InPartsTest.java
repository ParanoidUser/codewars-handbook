import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InPartsTest {
  @Test
  public void test() {
    assertEquals("sup erc ali fra gil ist ice xpi ali doc iou s", InParts.splitInParts("supercalifragilisticexpialidocious", 3));
    assertEquals("Hel loK ata", InParts.splitInParts("HelloKata", 3));
    assertEquals("H e l l o K a t a", InParts.splitInParts("HelloKata", 1));
    assertEquals("HelloKata", InParts.splitInParts("HelloKata", 9));
  }
}
