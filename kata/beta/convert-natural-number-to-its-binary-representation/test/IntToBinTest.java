import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IntToBinTest {
  @Test
  void shouldWorkWith0() {
    assertEquals("0", Kata.IntToBin(0));
  }

  @Test
  void shouldWorkWith8() {
    assertEquals("1000", Kata.IntToBin(8));
  }

  @Test
  void shouldWorkWith7() {
    assertEquals("111", Kata.IntToBin(7));
  }
}