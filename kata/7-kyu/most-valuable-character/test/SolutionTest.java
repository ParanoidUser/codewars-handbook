import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals('a', Solution.solve("a"));
    assertEquals('a', Solution.solve("aa"));
    assertEquals('b', Solution.solve("bcd"));
    assertEquals('x', Solution.solve("axyzxyz"));
    assertEquals('a', Solution.solve("dcbadcba"));
    assertEquals('c', Solution.solve("aabccc"));
    assertEquals('e', Solution.solve("efgefg"));
    assertEquals('e', Solution.solve("efghijefghi"));
    assertEquals('a', Solution.solve("acefacef"));
    assertEquals('a', Solution.solve("acefacefacef"));
  }
}
