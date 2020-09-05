import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("cawedors", Solution.solve("codewars", 1, 5));
    assertEquals("conuFsIgnid", Solution.solve("codingIsFun", 2, 100));
    assertEquals("FuargorPlanoitcnmming", Solution.solve("FunctionalProgramming", 2, 15));
    assertEquals("vutsrqponmlkjihgfecbawxyz", Solution.solve("abcefghijklmnopqrstuvwxyz", 0, 20));
    assertEquals("abcefvutsrqponmlkjihgwxyz", Solution.solve("abcefghijklmnopqrstuvwxyz", 5, 20));
  }
}