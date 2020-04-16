import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GhostbustersTests {
  @Test
  public void test1() {
    assertEquals("Factory", Ghostbusters.ghostBusters("Factor y"));
  }

  @Test
  public void test2() {
    assertEquals("Office", Ghostbusters.ghostBusters("O  f fi ce"));
  }

  @Test
  public void test3() {
    assertEquals("You just wanted my autograph didn't you?", Ghostbusters.ghostBusters("BusStation"));
  }
}
