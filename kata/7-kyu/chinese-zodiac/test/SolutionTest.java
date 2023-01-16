import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Wood Snake", Kata.chineseZodiac(1965));
    assertEquals("Earth Tiger", Kata.chineseZodiac(1938));
    assertEquals("Earth Tiger", Kata.chineseZodiac(1998));
    assertEquals("Fire Monkey", Kata.chineseZodiac(2016));
    assertEquals("Wood Rat", Kata.chineseZodiac(1924));
    assertEquals("Earth Monkey", Kata.chineseZodiac(1968));
    assertEquals("Water Dog", Kata.chineseZodiac(2162));
  }
}