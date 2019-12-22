import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EncapsulationDemoTest {
  @Test
  public void testSample() {
    EncapsulationDemo ed = new EncapsulationDemo();
    assertEquals(0, ed.getNumber());
  }
}
