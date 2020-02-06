import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindUniqTest {
  @Test
  public void sampleTestCases() {
    assertEquals(1.0, Kata.findUniq(new double[] {0, 1, 0}), 10e-10);
    assertEquals(2.0, Kata.findUniq(new double[] {1, 1, 1, 2, 1, 1}), 10e-10);
  }
}
