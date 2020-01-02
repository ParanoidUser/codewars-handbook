import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ResistanceTest {
  @Test
  public void resistanceTest1() {
    assertEquals(10.0, ParallelResistors.resistance(20, 20), 1e-10);
  }

  @Test
  public void resistanceTest2() {
    assertEquals(8.0, ParallelResistors.resistance(20, 20, 40), 1e-10);
  }
}
