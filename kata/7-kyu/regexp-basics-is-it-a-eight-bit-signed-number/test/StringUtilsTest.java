import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringUtilsTest {
  @Test
  public void fixedTests() {
    assertFalse(StringUtils.isSignedEightBitNumber(""));
    assertTrue(StringUtils.isSignedEightBitNumber("0"));
    assertFalse(StringUtils.isSignedEightBitNumber("00"));
    assertFalse(StringUtils.isSignedEightBitNumber("-0"));
    assertTrue(StringUtils.isSignedEightBitNumber("55"));
    assertTrue(StringUtils.isSignedEightBitNumber("-23"));
    assertFalse(StringUtils.isSignedEightBitNumber("042"));
    assertTrue(StringUtils.isSignedEightBitNumber("127"));
    assertFalse(StringUtils.isSignedEightBitNumber("128"));
    assertFalse(StringUtils.isSignedEightBitNumber("999"));
    assertTrue(StringUtils.isSignedEightBitNumber("-128"));
    assertFalse(StringUtils.isSignedEightBitNumber("-129"));
    assertFalse(StringUtils.isSignedEightBitNumber("-999"));
  }
}
