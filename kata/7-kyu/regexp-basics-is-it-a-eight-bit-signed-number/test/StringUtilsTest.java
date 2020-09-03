import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringUtilsTest {
  @Test
  void sample() {
    assertTrue(StringUtils.isSignedEightBitNumber("0"));
    assertTrue(StringUtils.isSignedEightBitNumber("55"));
    assertTrue(StringUtils.isSignedEightBitNumber("-23"));
    assertTrue(StringUtils.isSignedEightBitNumber("127"));
    assertTrue(StringUtils.isSignedEightBitNumber("-128"));
    assertFalse(StringUtils.isSignedEightBitNumber(""));
    assertFalse(StringUtils.isSignedEightBitNumber("00"));
    assertFalse(StringUtils.isSignedEightBitNumber("-0"));
    assertFalse(StringUtils.isSignedEightBitNumber("042"));
    assertFalse(StringUtils.isSignedEightBitNumber("128"));
    assertFalse(StringUtils.isSignedEightBitNumber("999"));
    assertFalse(StringUtils.isSignedEightBitNumber("-129"));
    assertFalse(StringUtils.isSignedEightBitNumber("-999"));
  }
}
