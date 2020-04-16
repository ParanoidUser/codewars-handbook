import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void test() {
    Dinglemouse.runRunners();
    assertTrue("Sorry, try again :-(", ThreadUtil.checkThreads());
  }
}