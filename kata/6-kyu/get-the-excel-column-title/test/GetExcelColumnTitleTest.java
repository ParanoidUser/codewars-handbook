import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class GetExcelColumnTitleTest {
  @Test
  void sample() {
    assertEquals("A", GetExcelColumnTitle.getColumnTitle(1));
    assertEquals("Z", GetExcelColumnTitle.getColumnTitle(26));
    assertEquals("AZ", GetExcelColumnTitle.getColumnTitle(52));
    assertEquals("BA", GetExcelColumnTitle.getColumnTitle(53));
    assertEquals("ZZ", GetExcelColumnTitle.getColumnTitle(702));
    assertEquals("AYK", GetExcelColumnTitle.getColumnTitle(1337));
    assertEquals("XPEH", GetExcelColumnTitle.getColumnTitle(432778));
    assertThrows(IllegalArgumentException.class, () -> GetExcelColumnTitle.getColumnTitle(0));
  }
}