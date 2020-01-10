import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CycleTest {
  @Test
  public void test1() {
    assertEquals(2, Cycle.cycle(33));
    assertEquals(-1, Cycle.cycle(18118));
    assertEquals(22, Cycle.cycle(69));
    assertEquals(98, Cycle.cycle(197));
    assertEquals(-1, Cycle.cycle(65));
  }
}
