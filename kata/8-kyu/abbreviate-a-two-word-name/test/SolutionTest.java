import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void testFixed() {
    assertEquals("S.H", AbbreviateTwoWords.abbrevName("Sam Harris"));
    assertEquals("P.F", AbbreviateTwoWords.abbrevName("Patrick Feenan"));
    assertEquals("E.C", AbbreviateTwoWords.abbrevName("Evan Cole"));
    assertEquals("P.F", AbbreviateTwoWords.abbrevName("P Favuzzi"));
    assertEquals("D.M", AbbreviateTwoWords.abbrevName("David Mendieta"));
  }
}
