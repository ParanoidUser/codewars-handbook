import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() throws Exception {
    assertEquals(-1, ThreadUtil.id1);
    assertEquals(-1, ThreadUtil.id2);

    Dinglemouse.runRunners();
    TimeUnit.MILLISECONDS.sleep(100);
    assertTrue(ThreadUtil.id1 != -1 && ThreadUtil.id2 != -1 && ThreadUtil.id1 != ThreadUtil.id2);
  }
}