import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Friends.friends(0));
    assertEquals(0, Friends.friends(1));
    assertEquals(0, Friends.friends(2));
    assertEquals(1, Friends.friends(4));
    assertEquals(1, Friends.friends(3));
    assertEquals(3, Friends.friends(16));
    assertEquals(11, Friends.friends(2570));
    assertEquals(14, Friends.friends(25700));
    assertEquals(26, Friends.friends(74093885));
    assertEquals(28, Friends.friends(314997064));
    assertEquals(29, Friends.friends(719694914));
    assertEquals(29, Friends.friends(1000696969));
  }
}
