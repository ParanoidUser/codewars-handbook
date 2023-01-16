import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Dinglemouse.deadAntCount("ant ant ant ant"));
    assertEquals(0, Dinglemouse.deadAntCount(null));
    assertEquals(2, Dinglemouse.deadAntCount("ant anantt aantnt"));
    assertEquals(1, Dinglemouse.deadAntCount("ant ant .... a nt"));
  }
}