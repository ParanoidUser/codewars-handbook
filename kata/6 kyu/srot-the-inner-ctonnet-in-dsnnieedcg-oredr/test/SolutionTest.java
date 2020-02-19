import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void exampleTests() {
    assertEquals("srot the inner ctonnet in dsnnieedcg oredr", Kata.sortTheInnerContent("sort the inner content in descending order"));
    assertEquals("wiat for me", Kata.sortTheInnerContent("wait for me"));
    assertEquals("tihs ktaa is esay", Kata.sortTheInnerContent("this kata is easy"));
  }
}
