import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KataTests {
  @Test
  void sample() {
    assertArrayEquals(new Object[]{3.6, "udiwstagwo"}, Kata.mean(new char[]{'u', '6', 'd', '1', 'i', 'w', '6', 's', 't', '4', 'a', '6', 'g', '1', '2', 'w', '8', 'o', '2', '0'}));
    assertArrayEquals(new Object[]{3., "cxwyvuhinu"}, Kata.mean(new char[]{'0', 'c', '7', 'x', '6', '2', '3', '5', 'w', '7', '0', 'y', 'v', 'u', 'h', 'i', 'n', 'u', '0', '0'}));
    assertArrayEquals(new Object[]{4.3, "uayaqvgydd"}, Kata.mean(new char[]{'0', 'u', 'a', 'y', '0', 'a', '9', 'q', '3', 'v', 'g', '7', '6', '4', 'y', 'd', '8', '6', '0', 'd'}));
    assertArrayEquals(new Object[]{4., "snlmizyzkk"}, Kata.mean(new char[]{'s', 'n', '9', 'l', '0', 'm', 'i', 'z', '9', '7', 'y', '4', 'z', '3', '3', 'k', '4', '1', '0', 'k'}));
    assertArrayEquals(new Object[]{6.1, "vukbgzfuit"}, Kata.mean(new char[]{'5', 'v', 'u', 'k', '8', '4', '9', 'b', '9', 'g', '5', 'z', '3', 'f', '6', 'u', 'i', '6', '6', 't'}));
    assertArrayEquals(new Object[]{.9, "aaddgquvyy"}, Kata.mean(new char[]{'1', '1', '1', '1', '1', '1', '1', '1', '1', '0', 'a', 'a', 'd', 'd', 'g', 'q', 'u', 'v', 'y', 'y'}));
    assertArrayEquals(new Object[]{1., "aaddgquvyy"}, Kata.mean(new char[]{'1', '1', '1', '1', '1', '1', '1', '1', '1', '1', 'a', 'a', 'd', 'd', 'g', 'q', 'u', 'v', 'y', 'y'}));
  }
}
