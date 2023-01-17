import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;
import org.junit.jupiter.api.Test;

class UrlMapTest {
  @Test
  void sample() throws Exception {
    UrlMap map = new UrlMap();
    assertEquals(-1, map.getTimestamp(new URL("https://www.codewars.com/")));
    assertEquals(-1, map.getTimestamp(new URL("https://www.codewars.com/kata/url-timestamps/")));

    map.setTimestamp(new URL("https://www.codewars.com/"), 12345L);
    map.setTimestamp(new URL("https://www.codewars.com/kata/url-timestamps/"), 67890L);
    assertEquals(12345L, map.getTimestamp(new URL("https://www.codewars.com/")));
    assertEquals(67890L, map.getTimestamp(new URL("https://www.codewars.com/kata/url-timestamps/")));
  }
}
