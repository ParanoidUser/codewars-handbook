import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AcronymGeneratorTest {
  @Test
  void sample() {
    assertEquals("TM", AcronymGenerator.createAcronym("Meyer", "Thomas"));
    assertEquals("PMS", AcronymGenerator.createAcronym("Meyer-Schmidt", "Paul"));
    assertEquals("JEM", AcronymGenerator.createAcronym("Mueller", "Jan Erich"));
    assertEquals("JES", AcronymGenerator.createAcronym("Schmidt", "Jan-Erich"));
    assertEquals("PvL", AcronymGenerator.createAcronym("von Lahnstein", "Peter"));
  }
}
