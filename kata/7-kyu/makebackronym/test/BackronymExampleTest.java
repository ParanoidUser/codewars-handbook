import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BackronymExampleTest {
  @Test
  void sample() {
    assertEquals("disturbing gregarious mustache", Backronym.makeBackronym("dgm"));
    assertEquals("literal klingon joke", Backronym.makeBackronym("lkj"));
    assertEquals("ingestable newtonian turn eager rant eager stylish turn ingestable newtonian gregarious", Backronym.makeBackronym("interesting"));
    assertEquals("confident oscillating disturbing eager weird awesome rant stylish", Backronym.makeBackronym("codewars"));
    assertEquals("", Backronym.makeBackronym(""));
  }
}
