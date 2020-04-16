import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void sampleTests() {
    int counter = 20;
    AtomicInteger executionCounter = new AtomicInteger();
    Runnable action = () -> {
          executionCounter.incrementAndGet();
          try {
            TimeUnit.MICROSECONDS.sleep(100);
          } catch (InterruptedException ignored) {
          }
        };
    Worker.execute(action, counter);
    assertEquals(counter, executionCounter.get());
  }
}
