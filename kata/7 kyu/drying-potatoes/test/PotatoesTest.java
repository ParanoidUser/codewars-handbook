import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PotatoesTest {
  @Test
  public void test() {
    assertEquals(114, Potatoes.potatoes(82, 127, 80));
    assertEquals(100, Potatoes.potatoes(93, 129, 91));
  }
}
