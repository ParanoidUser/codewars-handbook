import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {
  @Test
  public void exampleTests() {
    assertEquals("Wood Snake", "Wood Snake", Kata.chineseZodiac(1965));
    assertEquals("Earth Tiger", "Earth Tiger", Kata.chineseZodiac(1938));
    assertEquals("Earth Tiger", "Earth Tiger", Kata.chineseZodiac(1998));
    assertEquals("Fire Monkey", "Fire Monkey", Kata.chineseZodiac(2016));
    assertEquals("Wood Rat", "Wood Rat", Kata.chineseZodiac(1924));
    assertEquals("Earth Monkey", "Earth Monkey", Kata.chineseZodiac(1968));
    assertEquals("Water Dog", "Water Dog", Kata.chineseZodiac(2162));
  }
}
