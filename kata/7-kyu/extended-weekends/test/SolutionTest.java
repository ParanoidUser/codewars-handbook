import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"JANUARY", "MAY", "5"}, Solution.solve(2016, 2020));
    assertArrayEquals(new String[]{"MARCH", "DECEMBER", "51"}, Solution.solve(1900, 1950));
    assertArrayEquals(new String[]{"AUGUST", "OCTOBER", "702"}, Solution.solve(1800, 2500));
  }
}
