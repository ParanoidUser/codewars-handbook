import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTests {
  @Test
  public void test0() {
    assertEquals(0, Dinglemouse.hoursToSeconds(0));
  }

  @Test
  public void test123() {
    assertEquals(3600, Dinglemouse.hoursToSeconds(1));
    assertEquals(7200, Dinglemouse.hoursToSeconds(2));
    assertEquals(10800, Dinglemouse.hoursToSeconds(3));
  }

  @Test
  public void test24() {
    assertEquals(86400, Dinglemouse.hoursToSeconds(24));
  }
}
