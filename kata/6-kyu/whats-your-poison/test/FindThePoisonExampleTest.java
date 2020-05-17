import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FindThePoisonExampleTest {
  @Test
  void sample() {
    var finder = new FindThePoison();
    assertEquals(256, finder.find(new int[]{8}));
    assertEquals(27, finder.find(new int[]{0, 1, 3, 4}));
    assertEquals(555, finder.find(new int[]{0, 1, 9, 3, 5}));
    assertEquals(95, finder.find(new int[]{0, 1, 2, 3, 4, 6}));
    assertEquals(825, finder.find(new int[]{0, 3, 5, 4, 9, 8}));
  }
}    