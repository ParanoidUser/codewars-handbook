import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("H1H1FFFF00200000F4F4", StringPacket.communicationModule("H1H10F1200120008F4F4"));
    assertEquals("X7X7FFFF00820000L0L0", StringPacket.communicationModule("X7X7B7A201400058L0L0"));
    assertEquals("R5R5FFFF00960000K4K4", StringPacket.communicationModule("R5R5C3D900120008K4K4"));
  }
}
