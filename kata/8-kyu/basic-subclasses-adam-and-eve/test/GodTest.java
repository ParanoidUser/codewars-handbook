import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GodTest {
  @Test
  public void makingAdam() {
    Human[] paradise = God.create();
    assertTrue("Adam are a man", paradise[0] instanceof Man);
  }
}
