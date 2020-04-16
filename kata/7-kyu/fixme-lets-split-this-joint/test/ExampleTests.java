import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void example() {
    assertArrayEquals(new String[] {"a", "b", "c"}, Dinglemouse.split("a.b.c"));
    assertArrayEquals(new String[] {"a", "", "c"}, Dinglemouse.split("a..c"));
  }
}
