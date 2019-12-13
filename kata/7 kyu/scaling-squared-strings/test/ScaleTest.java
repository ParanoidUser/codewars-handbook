import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScaleTest {
  @Test
  public void test() {
    String r = "aabbccdd\naabbccdd\naabbccdd\neeffgghh\neeffgghh\neeffgghh\niijjkkll\niijjkkll\niijjkkll\nmmnnoopp\nmmnnoopp\nmmnnoopp";
    assertEquals(r, Scale.scale("abcd\nefgh\nijkl\nmnop", 2, 3));
    assertEquals("", Scale.scale("", 5, 5));
    assertEquals("Kj\nKj\nSH\nSH", Scale.scale("Kj\nSH", 1, 2));
  }
}
