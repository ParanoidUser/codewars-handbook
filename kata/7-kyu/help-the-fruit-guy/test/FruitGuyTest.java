import static org.junit.Assert.*;

import org.junit.Test;

public class FruitGuyTest {
  @Test
  public void testEmptyFruit() {
    assertArrayEquals(new String[0], FruitGuy.removeRotten(new String[0]));
  }

  @Test
  public void testAllRottenArray() {
    String[] rotten = { "rottenApple", "rottenBanana", "rottenApple", "rottenPineapple", "rottenKiwi" };
    String[] expected = {"apple", "banana", "apple", "pineapple", "kiwi"};
    assertArrayEquals(expected, FruitGuy.removeRotten(rotten));
  }
}
