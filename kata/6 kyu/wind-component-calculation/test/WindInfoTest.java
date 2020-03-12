import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WindInfoTest {
  @Test
  public void testMessage() {
    assertEquals("Headwind 15 knots. Crosswind 3 knots from your left.", WindInfo.message("18L", 170, 15));
    assertEquals("Headwind 10 knots. Crosswind 17 knots from your left.", WindInfo.message("22", 160, 20));
  }
}
