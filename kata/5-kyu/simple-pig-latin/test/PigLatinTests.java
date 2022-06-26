import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PigLatinTests {
  @Test
  void sample() {
    assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
    assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
  }
}