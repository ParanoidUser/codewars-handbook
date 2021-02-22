import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void testSimple() {
    assertEquals(0, Kata.subwayWastage());
    assertEquals(6, Kata.subwayWastage("Italian"));
    assertEquals(12, Kata.subwayWastage("9-Grain Wheat", "Italian"));
    assertEquals(6, Kata.subwayWastage("Flatbread"));
    assertEquals(0, Kata.subwayWastage("Hearty Italian", "Hearty Italian"));
  }

  @Test
  void testMedium() {
    assertEquals(0, Kata.subwayWastage("Italian", "9-Grain Honey Oat", "Italian", "9-Grain Honey Oat"));
    assertEquals(12, Kata.subwayWastage("Italian Herb & Cheese", "Italian", "Flatbread", "Italian"));
    assertEquals(36, Kata.subwayWastage("Flatbread", "9-Grain Wheat", "Italian", "Hearty Italian", "Italian Herb & Cheese", "9-Grain Honey Oat"));
    assertEquals(12, Kata.subwayWastage("Flatbread", "Flatbread", "Flatbread", "Flatbread", "Flatbread", "Italian"));
    assertEquals(18, Kata.subwayWastage("Flatbread", "Italian", "Italian", "9-Grain Wheat", "Flatbread", "Italian", "Flatbread"));
  }
}