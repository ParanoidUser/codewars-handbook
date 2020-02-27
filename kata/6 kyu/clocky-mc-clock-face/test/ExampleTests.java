import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void test1200() {
    assertEquals("12:00", Dinglemouse.whatTimeIsIt(0));
    assertEquals("12:00", Dinglemouse.whatTimeIsIt(360));
  }

  @Test
  public void test0300() {
    assertEquals("03:00", Dinglemouse.whatTimeIsIt(90));
  }

  @Test
  public void test0600() {
    assertEquals("06:00", Dinglemouse.whatTimeIsIt(180));
  }

  @Test
  public void test0900() {
    assertEquals("09:00", Dinglemouse.whatTimeIsIt(270));
  }
}
