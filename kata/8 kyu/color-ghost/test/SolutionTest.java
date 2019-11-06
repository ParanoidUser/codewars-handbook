import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    var colors = List.of("white", "yellow", "purple", "red");
    assertTrue(colors.contains(Ghost.getColor()));
  }
}
