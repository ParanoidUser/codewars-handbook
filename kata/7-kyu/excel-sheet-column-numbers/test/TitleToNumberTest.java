import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TitleToNumberTest {
  @Test
  void sample() {
    assertEquals(1, TitleToNumber.titleToNumber("A"));
    assertEquals(27, TitleToNumber.titleToNumber("AA"));
    assertEquals(52, TitleToNumber.titleToNumber("AZ"));
    assertEquals(53, TitleToNumber.titleToNumber("BA"));
    assertEquals(28779382963L, TitleToNumber.titleToNumber("CODEWARS"));
  }
}
