import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void examples() {
    assertEquals(4, Kata.getVolumeOfCuboid(1, 2, 2), 0.0001);
    assertEquals(63, Kata.getVolumeOfCuboid(6.3, 2, 5), 0.0001);
  }
}
