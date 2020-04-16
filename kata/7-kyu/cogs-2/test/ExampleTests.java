import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void example() {
    assertArrayEquals(new double[] {-.5, -2}, Dinglemouse.cogRpm(new int[] {100, 50, 25}, 1), .001);
  }
}
