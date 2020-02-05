import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class SmileFacesTest {
  @Test
  public void test1() {
    assertEquals(2, SmileFaces.countSmileys(List.of(":)", ":D", ":-}", ":-()")));
  }

  @Test
  public void test2() {
    assertEquals(1, SmileFaces.countSmileys(List.of(":)", "XD", ":0}", "x:-", "):-", "D:")));
  }

  @Test
  public void test4() {
    assertEquals(2, SmileFaces.countSmileys(List.of(":)", ":D", "X-}", "xo)", ":X", ":-3", ":3")));
  }

  @Test
  public void test5() {
    assertEquals(4, SmileFaces.countSmileys(List.of(":)", ":)", "x-]", ":ox", ";-(", ";-)", ";~(", ":~D")));
  }
}
