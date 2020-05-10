import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataExampleTwistTest {
  @Test
  void sample() {
    String[] websites = KataExampleTwist.kataExampleTwist();
    assertEquals(1000, websites.length);
    for (String website : websites) {
      assertEquals("codewars", website);
    }
  }
}
