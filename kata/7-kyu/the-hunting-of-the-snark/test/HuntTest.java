import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HuntTest {
  @Test
  void sample() {
    assertEquals("Pounce!", Hunt.assess(
        new int[]{0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, 0, 0, 0, 0},
        new String[]{"", "", "", "", "", "", "", "", "snark", "", "", "", "", "", "", "", ""}));

    assertEquals("Run!", Hunt.assess(
        new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0, 0, 0, 0, 0, 0},
        new String[]{"", "", "", "", "", "", "", "", "", "", "snark", "", "", "", "", "", ""}));

    assertEquals("Stalk quietly...", Hunt.assess(
        new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, 0},
        new String[]{"", "", "", "", "", "", "", "", "", "", "", "snark", "", "", "", "", ""}));

    assertEquals("Escape quietly...", Hunt.assess(
        new int[]{0, 0, 0, 0, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        new String[]{"", "", "", "", "snark", "", "", "", "", "", "", "", "", "", "", "", ""}));

    assertEquals("There's a Snark close.", Hunt.assess(
        new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14},
        new String[]{"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "snark"}));

    assertEquals("There's a Boojum close.", Hunt.assess(
        new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15},
        new String[]{"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "snark"}));

    assertEquals("Keep hunting.", Hunt.assess(
        new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        new String[]{"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""}));
  }
}