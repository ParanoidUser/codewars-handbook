import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BioTest {
  @Test
  void sample() {
    assertEquals("UUUU", new Bio().dnaToRna("TTTT"));
    assertEquals("GCAU", new Bio().dnaToRna("GCAT"));
  }
}
