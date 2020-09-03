import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SampleTests {
  @Test
  void sample() {
    assertTrue(Dinglemouse.redacted("TOP SECRET:\nThe missile launch code for Sunday XXXXXXXXXX is:\nXXXXXXXXXXXXXXXXX", "TOP SECRET:\nThe missile launch code for Sunday 5th August is:\n7-ZERO-8X-ALPHA-1"));
    assertTrue(Dinglemouse.redacted("XXXXXXXX XXXXXXX XXXXXXXXXXXXXXXXXXX\nXXXX XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX XXXXXXXXX XXXXXXXXXXXXX XXXXX", "Area-51. Medical Report. 23/Oct/1969\nE.T. subject 4 was given an asprin after reporting sick for duty today"));
    assertFalse(Dinglemouse.redacted("The name of the mole is Professor XXXXX", "The name of the mole is Professor Dinglemouse"));
    assertFalse(Dinglemouse.redacted("This is a XXXX. Will you pass it?", "This is a test. Will you fail it?"));
    assertFalse(Dinglemouse.redacted("Line1\nXLine2X", "Line1\n\nLine2\n"));
  }
}
