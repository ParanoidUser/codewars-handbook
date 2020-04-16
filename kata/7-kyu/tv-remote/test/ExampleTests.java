import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void example() {
    assertEquals(36, Dinglemouse.tvRemote("codewars"));
  }

  @Test
  public void misc() {
    assertEquals(16, Dinglemouse.tvRemote("does"));
    assertEquals(23, Dinglemouse.tvRemote("your"));
    assertEquals(33, Dinglemouse.tvRemote("solution"));
    assertEquals(20, Dinglemouse.tvRemote("work"));
    assertEquals(12, Dinglemouse.tvRemote("for"));
    assertEquals(27, Dinglemouse.tvRemote("these"));
    assertEquals(25, Dinglemouse.tvRemote("words"));
  }
}
