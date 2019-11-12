import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GrassHopperTest {
  @Test
  public void test1() {
    assertEquals("Hello, Mr. Spock", GrassHopper.sayHello("Mr. Spock"));
  }

  @Test
  public void test2() {
    assertEquals("Hello, Captain Kirk", GrassHopper.sayHello("Captain Kirk"));
  }

  @Test
  public void test3() {
    assertEquals("Hello, Liutenant Uhura", GrassHopper.sayHello("Liutenant Uhura"));
  }

  @Test
  public void test4() {
    assertEquals("Hello, Dr. McCoy", GrassHopper.sayHello("Dr. McCoy"));
  }
}
