import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WindInfoTest {
  @Test
  void sample() {
    assertEquals("Headwind 15 knots. Crosswind 3 knots from your left.", WindInfo.message("18L", 170, 15));
    assertEquals("Tailwind 60 knots. Crosswind 104 knots from your right.", WindInfo.message("22", 160, -120));
    assertEquals("Headwind 12 knots. Crosswind 7 knots from your right.", WindInfo.message("18", 210, 14));
    assertEquals("Tailwind 3 knots. Crosswind 16 knots from your left.", WindInfo.message("36", 258, 16));
  }
}
