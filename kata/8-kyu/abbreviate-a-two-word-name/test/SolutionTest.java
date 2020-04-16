import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testFixed() {
    assertEquals("S.H", AbbreviateTwoWords.abbrevName("Sam Harris"));
    assertEquals("P.F", AbbreviateTwoWords.abbrevName("Patrick Feenan"));
    assertEquals("E.C", AbbreviateTwoWords.abbrevName("Evan Cole"));
    assertEquals("P.F", AbbreviateTwoWords.abbrevName("P Favuzzi"));
    assertEquals("D.M", AbbreviateTwoWords.abbrevName("David Mendieta"));
  }
}
