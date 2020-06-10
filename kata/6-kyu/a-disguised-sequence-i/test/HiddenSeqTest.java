import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class HiddenSeqTest {
  @Test
  void sample() {
    assertEquals(BigInteger.valueOf(131072), HiddenSeq.fcn(17));
    assertEquals(BigInteger.valueOf(2097152), HiddenSeq.fcn(21));
    assertEquals(BigInteger.valueOf(16384), HiddenSeq.fcn(14));
    assertEquals(BigInteger.valueOf(8796093022208L), HiddenSeq.fcn(43));
    assertEquals(BigInteger.valueOf(524288), HiddenSeq.fcn(19));
  }
}
