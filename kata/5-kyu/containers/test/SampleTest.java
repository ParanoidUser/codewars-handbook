import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void basicTests() {
    assertEquals(1, Kata.containers("A"));
    assertEquals(3, Kata.containers("CBACBACBACBACBA"));
  }
}
