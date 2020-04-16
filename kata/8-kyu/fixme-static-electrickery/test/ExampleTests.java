import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void test() {
    assertEquals(123, Dinglemouse.INST.plus100(23));
  }
}
