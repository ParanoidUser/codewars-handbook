import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvaporatorTest {
  @Test
  public void testEvaporatorOne() {
    assertEquals(22, Evaporator.evaporator(10, 10, 10));
  }
}
