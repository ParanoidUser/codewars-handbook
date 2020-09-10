import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"Begin on Road A"}, Solution.solve(new String[]{"Begin on Road A"}));
    assertArrayEquals(new String[]{"Begin on 9th Dr", "Right on First Road", "Left on 3rd Blvd"}, Solution.solve(new String[]{"Begin on 3rd Blvd", "Right on First Road", "Left on 9th Dr"}));
    assertArrayEquals(new String[]{"Begin on Road D", "Right on Road C", "Left on Road B", "Left on Road A"}, Solution.solve(new String[]{"Begin on Road A", "Right on Road B", "Right on Road C", "Left on Road D"}));
  }
}