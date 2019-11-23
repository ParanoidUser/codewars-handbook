import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution() {
    assertEquals("############5616", Maskify.maskify("4556364607935616"));
    assertEquals("#######5616", Maskify.maskify("64607935616"));
    assertEquals("1", Maskify.maskify("1"));
    assertEquals("", Maskify.maskify(""));
    assertEquals("##ippy", Maskify.maskify("Skippy"));
    assertEquals("####################################man!", Maskify.maskify("Nananananananananananananananana Batman!"));
  }
}
