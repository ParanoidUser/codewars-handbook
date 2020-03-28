import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NewYearTest {
  @Test
  public void test() {
    assertEquals(16, NewYear.yakim("Iachimciuc Bogdan"));
    assertEquals(12, NewYear.yakim("Blanari Denis"));
    assertEquals(7, NewYear.yakim("Vitalie"));
    assertEquals(6, NewYear.yakim("Andrei"));
    assertEquals(0, NewYear.yakim(" "));
  }
}
