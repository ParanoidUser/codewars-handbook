import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, Solution.solve("strengthlessnesses"));
    assertEquals(2, Solution.solve("codewarriors"));
    assertEquals(3, Solution.solve("ultrarevolutionariees"));
    assertEquals(3, Solution.solve("suoidea"));
    assertEquals(11, Solution.solve("mnopqriouaeiopqrstuvwxyuaeiouaeiou"));
  }
}