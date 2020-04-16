import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void test() {
    assertEquals("Clint Eastwood", new Dinglemouse("Clint", "Eastwood").getFullName());
  }
}
