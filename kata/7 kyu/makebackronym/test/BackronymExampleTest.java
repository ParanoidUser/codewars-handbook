import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BackronymExampleTest {
  @Test
  public void testExample() {
    assertThat(Backronym.makeBackronym("dgm"), is("disturbing gregarious mustache"));
    assertThat(Backronym.makeBackronym("lkj"), is("literal klingon joke"));
    assertThat(Backronym.makeBackronym("interesting"), is("ingestable newtonian turn eager rant eager stylish turn ingestable newtonian gregarious"));
    assertThat(Backronym.makeBackronym("codewars"), is("confident oscillating disturbing eager weird awesome rant stylish"));
    assertThat(Backronym.makeBackronym(""), is(""));
  }
}
