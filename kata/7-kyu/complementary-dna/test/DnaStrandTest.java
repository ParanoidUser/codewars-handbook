import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DnaStrandTest {
  @Test
  void sample() {
    assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
    assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
  }
}
