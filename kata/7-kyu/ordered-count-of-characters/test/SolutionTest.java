import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
      assertEquals(List.of(Pair.of('2', 2), Pair.of('3', 3), Pair.of('1', 1)), Solution.orderedCount("233312"));
      assertEquals(List.of(Pair.of('a', 5), Pair.of('b', 2), Pair.of('r', 2), Pair.of('c', 1), Pair.of('d', 1)), Solution.orderedCount("abracadabra"));
      assertEquals(List.of(Pair.of('C', 1), Pair.of('o', 1), Pair.of('d', 1), Pair.of('e', 1), Pair.of(' ', 1), Pair.of('W', 1), Pair.of('a', 1), Pair.of('r', 1), Pair.of('s', 1)), Solution.orderedCount("Code Wars"));
  }
}