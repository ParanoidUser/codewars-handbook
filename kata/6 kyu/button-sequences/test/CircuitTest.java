import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircuitTest {
  @Test
  public void sampleTest() {
    assertEquals("RBRB", Circuit.ledSeq("10011010", "10110111"));
    assertEquals("RB", Circuit.ledSeq("01101000", "00111000"));
    assertEquals("RB", Circuit.ledSeq("01001000", "01011100"));
  }
}
