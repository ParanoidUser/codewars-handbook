import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestExample {
  @Test
  public void test4By3() {
    assertEquals("1024x768", Kata.findScreenHeight(1024, "4:3"));
  }

  @Test
  public void test16By9() {
    assertEquals("1280x720", Kata.findScreenHeight(1280, "16:9"));
  }

  @Test
  public void test32By9() {
    assertEquals("3840x1080", Kata.findScreenHeight(3840, "32:9"));
  }
}
