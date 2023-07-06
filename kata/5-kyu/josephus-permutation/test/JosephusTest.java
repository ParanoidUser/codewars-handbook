import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JosephusTest {
  @Test
  void sample() {
    assertEquals(List.of(3, 6, 2, 7, 5, 1, 4), Josephus.josephusPermutation(mutable(1, 2, 3, 4, 5, 6, 7), 3));
    assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), Josephus.josephusPermutation(mutable(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 1));
    assertEquals(List.of(2, 4, 6, 8, 10, 3, 7, 1, 9, 5), Josephus.josephusPermutation(mutable(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 2));
    assertEquals(List.of("e", "s", "W", "o", "C", "d", "r", "a"), Josephus.josephusPermutation(mutable("C", "o", "d", "e", "W", "a", "r", "s"), 4));
    assertEquals(List.of(), Josephus.josephusPermutation(List.of(), 3));
  }

  private List<Object> mutable(Object... items) {
    return new ArrayList<>(List.of(items));
  }
}