import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CarboatTest {
  @Test
  void sample() {
    assertEquals("[[M: 37 B: 5 C: 4][M: 100 B: 14 C: 11]]", Carboat.howmuch(1, 100));
    assertEquals("[]", Carboat.howmuch(2950, 2950));
  }
}
