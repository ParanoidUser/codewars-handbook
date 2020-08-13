import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("3 minutes 15 seconds", CookingTime.getTime("600W", 4, 20, "800W"));
    assertEquals("2 minutes 0 seconds", CookingTime.getTime("800W", 3, 0, "1200W"));
    assertEquals("17 minutes 30 seconds", CookingTime.getTime("100W", 8, 45, "50W"));
    assertEquals("1 minutes 3 seconds", CookingTime.getTime("7500W", 0, 5, "600W"));
    assertEquals("1 minutes 38 seconds", CookingTime.getTime("450W", 3, 25, "950W"));
    assertEquals("55 minutes 0 seconds", CookingTime.getTime("21W", 64, 88, "25W"));
    assertEquals("199 minutes 0 seconds", CookingTime.getTime("83W", 61, 80, "26W"));
    assertEquals("302 minutes 0 seconds", CookingTime.getTime("38W", 95, 22, "12W"));
  }
}
