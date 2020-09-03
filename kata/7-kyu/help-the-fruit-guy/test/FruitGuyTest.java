import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class FruitGuyTest {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"apple", "banana", "apple", "pineapple", "kiwi"}, FruitGuy.removeRotten(new String[]{"rottenApple", "rottenBanana", "rottenApple", "rottenPineapple", "rottenKiwi"}));
    assertArrayEquals(new String[0], FruitGuy.removeRotten(null));
  }
}
