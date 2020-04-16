import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTestCases {
  @Test
  public void sampleTests() {
    assertEquals(6.67e-12, Solution.solution(new double[] {1000, 1000, 100}, new String[] {"g", "kg", "m"}), 1e-5);
    assertEquals(6.67e-9, Solution.solution(new double[] {1000, 1000, 100}, new String[] {"kg", "kg", "m"}), 1e-5);
    assertEquals(0.0000667, Solution.solution(new double[] {1000, 1000, 100}, new String[] {"kg", "kg", "cm"}), 1e-5);
  }
}
