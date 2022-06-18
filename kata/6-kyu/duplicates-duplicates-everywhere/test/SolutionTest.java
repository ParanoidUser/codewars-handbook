import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(Map.of(
            1, List.of(),
            2, List.of(),
            3, List.of("A")),
        Solution.removeDuplicateIds(Map.of(
            1, List.of("A"),
            2, List.of("A"),
            3, List.of("A"))));

    assertEquals(Map.of(
            1, List.of("C"),
            2, List.of("A", "B", "D")),
        Solution.removeDuplicateIds(Map.of(
            1, List.of("A", "B", "C"),
            2, List.of("A", "B", "D", "A"))));

    assertEquals(Map.of(
            1, List.of("F", "G"),
            2, List.of("C"),
            3, List.of("A", "B", "D")),
        Solution.removeDuplicateIds(Map.of(
            1, List.of("C", "F", "G"),
            2, List.of("A", "B", "C"),
            3, List.of("A", "B", "D"))));

    assertEquals(Map.of(
            432, List.of("A", "B", "D"),
            53, List.of("C"),
            236, List.of("L", "X", "G", "H"),
            11, List.of("P", "R", "S")),
        Solution.removeDuplicateIds(Map.of(
            432, List.of("A", "A", "B", "D"),
            53, List.of("L", "G", "B", "C"),
            236, List.of("L", "A", "X", "G", "H", "X"),
            11, List.of("P", "R", "S", "D"))));
  }
}
