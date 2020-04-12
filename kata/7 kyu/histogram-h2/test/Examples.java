import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Examples {
  @Test
  void example() {
    String expected =
        "6|██ 5%\n"
            + "5|\n"
            + "4|███████ 15%\n"
            + "3|███████████████████████████████████ 70%\n"
            + "2|█ 3%\n"
            + "1|███ 7%\n";
    assertEquals(expected, Dinglemouse.histogram(new int[] {7, 3, 70, 15, 0, 5}));
  }

  @Test
  void all3s() {
    String expected =
        "6|\n"
            + "5|\n"
            + "4|\n"
            + "3|██████████████████████████████████████████████████ 100%\n"
            + "2|\n"
            + "1|\n";
    assertEquals(expected, Dinglemouse.histogram(new int[] {0, 0, 11, 0, 0, 0}));
  }
}
