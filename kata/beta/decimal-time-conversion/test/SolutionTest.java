import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0.02, DTC.toIndustrial(1));
    assertEquals(0.03, DTC.toIndustrial(2));
    assertEquals(1.75, DTC.toIndustrial(105));
    assertEquals(0.05, DTC.toIndustrial("0:03"));
    assertEquals(0.07, DTC.toIndustrial("0:04"));
    assertEquals(1.75, DTC.toIndustrial("1:45"));
    assertEquals("0:03", DTC.toNormal(0.05));
    assertEquals("0:20", DTC.toNormal(0.33));
    assertEquals("1:45", DTC.toNormal(1.75));
  }
}