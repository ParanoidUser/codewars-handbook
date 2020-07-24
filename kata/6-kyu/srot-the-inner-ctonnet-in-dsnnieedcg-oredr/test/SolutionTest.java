import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("srot the inner ctonnet in dsnnieedcg oredr", Kata.sortTheInnerContent("sort the inner content in descending order"));
    assertEquals("wiat for me", Kata.sortTheInnerContent("wait for me"));
    assertEquals("tihs ktaa is esay", Kata.sortTheInnerContent("this kata is easy"));
  }
}
