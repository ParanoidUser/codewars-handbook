import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class KataExampleTwistTest {
  @Test
  public void test() {
    String[] websites = KataExampleTwist.kataExampleTwist();
    assertTrue(websites.length > 0);
    assertEquals(1000, websites.length);
    for (String website : websites) {
      assertEquals("codewars", website);
    }
  }
}
