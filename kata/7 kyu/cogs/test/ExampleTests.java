import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void example() {
    assertEquals(-4d / 3, Dinglemouse.cogRpm(new int[] {100, 75}), 0.001);
  }
}
