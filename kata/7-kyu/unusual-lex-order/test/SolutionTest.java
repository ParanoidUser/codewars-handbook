import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new String[] {"a", "a", "b", "c", "d"}, new Solution().unusualLexOrder(new String[] {"a", "b", "a", "d", "c"}));
    assertArrayEquals(new String[] {"ta", "nigeb", "gninnigeb", "eht"}, new Solution().unusualLexOrder(new String[] {"nigeb", "ta", "eht", "gninnigeb"}));
  }
}
