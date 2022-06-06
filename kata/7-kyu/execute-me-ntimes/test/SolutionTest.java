import static org.awaitility.Awaitility.await;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    int counter = 20;
    AtomicInteger executionCounter = new AtomicInteger();
    Runnable action = () -> await().atMost(200, TimeUnit.MILLISECONDS)
             .until(() -> executionCounter.get() < executionCounter.incrementAndGet());
    new Worker().execute(action, counter);
    assertEquals(counter, executionCounter.get());
  }
}
