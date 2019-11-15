import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void exampleTest() {
    assertEquals("Your function should have returned 'Welcome'. Try again.", "Welcome", Welcome.greet("english"));
    assertEquals("Your function should have returned 'Welkom'. Try again.", "Welkom", Welcome.greet("dutch"));
    assertEquals("Your function should have returned 'Welcome'. Try again.", "Welcome", Welcome.greet("IP_ADDRESS_INVALID"));
  }
}
