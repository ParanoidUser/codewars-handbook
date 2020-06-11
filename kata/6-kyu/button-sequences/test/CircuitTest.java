import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CircuitTest {
  @Test
  void sample() {
    assertEquals("RBRB", Circuit.ledSeq("10011010", "10110111"));
    assertEquals("RB", Circuit.ledSeq("01101000", "00111000"));
    assertEquals("RB", Circuit.ledSeq("01001000", "01011100"));
  }
}
