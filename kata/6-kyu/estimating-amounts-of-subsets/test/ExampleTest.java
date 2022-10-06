import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleTest {
  @Test
  void sample() {
    assertEquals(0L, Subsets.count(new Integer[]{}));
    assertEquals(1L, Subsets.count(new Integer[]{0}));
    assertEquals(15L, Subsets.count(new Integer[]{1, 2, 3, 4}));
    assertEquals(127L, Subsets.count(new Integer[]{2, 3, 4, 5, 5, 6, 6, 7, 8, 8}));
    assertEquals(1L, Subsets.count(new Integer[]{1, 1, 1, 1, 1, 1, 1, 1}));
    assertEquals(511L, Subsets.count(new Character[]{'a', 'z', 'z', 'z', 'b', 'j', 'f', 'k', 'b', 'd', 'j', 'j', 'n', 'm', 'm'}));
    assertEquals(511L, Subsets.count(new String[]{"a", "z", "z", "z", "b", "j", "f", "k", "b", "d", "j", "j", "n", "m", "m"}));
    assertEquals(576460752303423487L, Subsets.count(new Character[]{'5', 's', '1', '7', 'T', 'g', 'U', 'x', 'Y', 'I', 'S', 'p', 't', 'X', 'f', 'c', 'B', 'n', 'u', 'O', 'R', 'D', 'P', 'L', 'j', 'y', 'r', 'd', 'Q', 'V', 'K', '3', 'v', 'G', 'a', '6', 'm', 'N', 'C', 'z', 'J', '=', '8', '+', '2', 'o', '9', 'w', 'b', 'E', 'M', 'q', 'k', 'W', 'H', 'i', '4', 'l', 'h'}));
  }
}
