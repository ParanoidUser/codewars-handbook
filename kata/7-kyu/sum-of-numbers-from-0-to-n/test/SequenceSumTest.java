import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SequenceSumTest {
  @Test
  void sample() {
    assertEquals("0+1+2+3+4+5+6 = 21", SequenceSum.showSequence(6));
    assertEquals("0=0", SequenceSum.showSequence(0));
    assertEquals("-45<0", SequenceSum.showSequence(-45));
  }
}
