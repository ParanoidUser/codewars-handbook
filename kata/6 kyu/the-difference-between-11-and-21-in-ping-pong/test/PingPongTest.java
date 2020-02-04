import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class PingPongTest {
  @Test
  public void test() {
    ArrayList<Score> result = new ArrayList<>();
    result.add(new Score(11, 0));
    result.add(new Score(11, 0));
    result.add(new Score(1, 1));
    result.add(new Score(21, 0));
    result.add(new Score(2, 1));
    assertEquals(result, PingPong.result("WWWWWWWWWWWWWWWWWWWWWWLW"));

    result = new ArrayList<>();
    result.add(new Score(11, 0));
    result.add(new Score(0, 11));
    result.add(new Score(11, 11));
    assertEquals(result, PingPong.result("WWWWWWWWWWWLLLLLLLLLLL"));

    result = new ArrayList<>();
    result.add(new Score(9, 11));
    result.add(new Score(1, 0));
    result.add(new Score(10, 11));
    assertEquals(result, PingPong.result("WLWLLLWWWLWLWLLLWLWLW"));
  }
}
