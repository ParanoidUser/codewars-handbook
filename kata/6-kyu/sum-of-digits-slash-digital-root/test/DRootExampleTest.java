import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DRootExampleTest {
  @Test
  public void tests() {
    assertEquals("Nope!", 7, DRoot.digital_root(16));
    assertEquals("Nope!", 6, DRoot.digital_root(456));
  }
}
