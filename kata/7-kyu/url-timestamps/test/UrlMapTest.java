import static org.junit.Assert.assertEquals;

import java.net.URL;

import org.junit.Test;

public class UrlMapTest {
  @Test
  public void testCodewars() throws Exception {
    UrlMap map = new UrlMap();
    URL url1 = new URL("http://www.codewars.com/");
    long time1 = 12345L;
    URL url2 = new URL("http://www.codewars.com/kata/url-timestamps/");
    long time2 = 67890L;
    map.setTimestamp(url1, time1);
    map.setTimestamp(url2, time2);
    assertEquals(time1, map.getTimestamp(url1));
    assertEquals(time2, map.getTimestamp(url2));
  }

  @Test
  public void testNew() throws Exception {
    UrlMap map = new UrlMap();
    URL url1 = new URL("http://www.codewars.com/");
    URL url2 = new URL("http://www.codewars.com/kata/url-timestamps/");
    assertEquals(-1, map.getTimestamp(url1));
    assertEquals(-1, map.getTimestamp(url2));
  }
}
