import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void basicTests() {
    assertEquals(Kata.containers("A"), 1);
    assertEquals(Kata.containers("CBACBACBACBACBA"), 3);
  }
}
