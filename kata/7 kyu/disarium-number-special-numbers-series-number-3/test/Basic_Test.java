import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Basic_Test {
  @Test
  public void disariumOrNOT() {
    assertEquals("Disarium !!", Solution.disariumNumber(89));
    assertEquals("Not !!", Solution.disariumNumber(564));
    assertEquals("Not !!", Solution.disariumNumber(1024));
  }

  @Test
  public void largerNumbers() {
    assertEquals("Not !!", Solution.disariumNumber(64599));
    assertEquals("Not !!", Solution.disariumNumber(136586));
    assertEquals("Not !!", Solution.disariumNumber(1048576));
  }
}
