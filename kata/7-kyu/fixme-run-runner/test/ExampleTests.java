import static org.awaitility.Awaitility.await;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(-1, ThreadUtil.id1);
    assertEquals(-1, ThreadUtil.id2);

    Dinglemouse.runRunners();
    await().atMost(200, TimeUnit.MILLISECONDS)
        .until(() -> ThreadUtil.id1 != -1 && ThreadUtil.id2 != -1 && ThreadUtil.id1 != ThreadUtil.id2);
  }
}