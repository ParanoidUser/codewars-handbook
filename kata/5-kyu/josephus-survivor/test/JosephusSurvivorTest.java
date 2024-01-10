import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JosephusSurvivorTest {
  @Test
  void sample() {
    assertEquals(4, JosephusSurvivor.josephusSurvivor(7, 3));
    assertEquals(10, JosephusSurvivor.josephusSurvivor(11, 19));
    assertEquals(28, JosephusSurvivor.josephusSurvivor(40, 3));
    assertEquals(13, JosephusSurvivor.josephusSurvivor(14, 2));
    assertEquals(100, JosephusSurvivor.josephusSurvivor(100, 1));
  }
}