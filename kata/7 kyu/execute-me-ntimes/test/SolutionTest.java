import static org.junit.Assert.assertEquals;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void sampleTests() {
    int counter = 20;
    AtomicInteger executionCounter = new AtomicInteger();
    Runnable action =
        () -> {
          executionCounter.incrementAndGet();
          try {
            Thread.sleep(100);
          } catch (InterruptedException ex) {
          }
        };
    Worker.execute(action, counter);
    assertEquals(counter, executionCounter.get());
  }
}
