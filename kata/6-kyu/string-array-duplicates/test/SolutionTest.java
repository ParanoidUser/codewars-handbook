import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"keles", "kenes"}, Solution.dup(new String[]{"kelless", "keenness"}));
    assertArrayEquals(new String[]{"abracadabra", "alote", "asese"}, Solution.dup(new String[]{"abracadabra", "allottee", "assessee"}));
    assertArrayEquals(new String[]{"codewars", "picaniny", "hubububo"}, Solution.dup(new String[]{"ccooddddddewwwaaaaarrrrsssss", "piccaninny", "hubbubbubboo"}));
  }
}
