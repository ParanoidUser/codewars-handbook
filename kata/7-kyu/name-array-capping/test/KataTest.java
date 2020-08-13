import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertArrayEquals(new String[] {"Jo", "Nelson", "Jurie"}, Kata.capMe(new String[] {"jo", "nelson", "jurie"}));
    assertArrayEquals(new String[] {"Ror", "Nor", "Xor"}, Kata.capMe(new String[] {"Ror", "NOR", "xor"}));
  }
}
