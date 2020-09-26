import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DinglemouseTest {
  @Test
  void example() {
    assertEquals("6|██ 5%\n5|\n4|███████ 15%\n3|███████████████████████████████████ 70%\n2|█ 3%\n1|███ 7%\n", Dinglemouse.histogram(new int[] {7, 3, 70, 15, 0, 5}));
    assertEquals("6|\n5|\n4|\n3|██████████████████████████████████████████████████ 100%\n2|\n1|\n", Dinglemouse.histogram(new int[] {0, 0, 11, 0, 0, 0}));
  }
}
