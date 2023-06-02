import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    var groups = CreateTwoSetsOfEqualSum.createTwoSetsOfEqualSum(8);
    assertEquals(List.of(8, 5, 4, 1), groups.get(0));
    assertEquals(List.of(7, 6, 3, 2), groups.get(1));

    assertEquals(List.of(List.of(), List.of()), CreateTwoSetsOfEqualSum.createTwoSetsOfEqualSum(1));
    assertEquals(List.of(List.of(), List.of()), CreateTwoSetsOfEqualSum.createTwoSetsOfEqualSum(9));
  }
}