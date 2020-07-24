import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StrongestEvenNumberTest {
  @Test
  void sample() {
    assertEquals(2, StrongestEvenNumber.strongestEven(1, 2));
    assertEquals(8, StrongestEvenNumber.strongestEven(5, 10));
    assertEquals(48, StrongestEvenNumber.strongestEven(48, 56));
    assertEquals(192, StrongestEvenNumber.strongestEven(129, 193));
  }
}
