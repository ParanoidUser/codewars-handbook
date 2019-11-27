import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TitleToNumberTest {
  @Test
  public void test0() {
    assertEquals(1, TitleToNumber.titleToNumber("A"));
    assertEquals(27, TitleToNumber.titleToNumber("AA"));
    assertEquals(52, TitleToNumber.titleToNumber("AZ"));
    assertEquals(53, TitleToNumber.titleToNumber("BA"));
    assertEquals(28779382963L, TitleToNumber.titleToNumber("CODEWARS"));
  }
}
