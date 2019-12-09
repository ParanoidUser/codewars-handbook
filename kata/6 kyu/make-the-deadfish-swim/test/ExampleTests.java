import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void exampleTests() {
    assertArrayEquals(new int[] {8, 64}, DeadFish.parse("iiisdoso"));
    assertArrayEquals(new int[] {8, 64, 3600}, DeadFish.parse("iiisdosodddddiso"));
  }
}
