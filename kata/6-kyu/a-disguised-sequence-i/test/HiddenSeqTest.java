import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class HiddenSeqTest {
  @Test
  public void test1() {
    assertEquals(BigInteger.valueOf(131072), HiddenSeq.fcn(17));
    assertEquals(BigInteger.valueOf(2097152), HiddenSeq.fcn(21));
    assertEquals(BigInteger.valueOf(16384), HiddenSeq.fcn(14));
    assertEquals(BigInteger.valueOf(8796093022208L), HiddenSeq.fcn(43));
    assertEquals(BigInteger.valueOf(524288), HiddenSeq.fcn(19));
  }
}
