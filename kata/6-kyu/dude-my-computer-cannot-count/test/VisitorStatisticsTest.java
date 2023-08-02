
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.CountDownLatch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VisitorStatisticsTest {
  private VisitorStatistics visitorStatistics;

  @BeforeEach
  public void setUp() {
    visitorStatistics = new VisitorStatistics();
  }

  @Test
  void shouldIncrementCounterAndTrackUsers() {
    visitorStatistics.visit("A");
    visitorStatistics.visit("B");
    visitorStatistics.visit("A");
    assertEquals(3, visitorStatistics.totalVisits());
    assertEquals(2, visitorStatistics.visitsBy("A"));
    assertEquals(1, visitorStatistics.visitsBy("B"));
  }

  @Test
  void shouldHandleConcurrentAccess() throws Exception {
    CountDownLatch latch = new CountDownLatch(1);
    Thread[] threads = new Thread[100];
    String name = "Visitor";
    for (int i = 0; i < threads.length; i++) {
      threads[i] = new Thread(() -> {
        try {
          latch.await();
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        visitorStatistics.visit(name);
      });
      threads[i].start();
    }
    latch.countDown();
    for (Thread thread : threads) {
      thread.join(100);
    }
    assertEquals(threads.length, visitorStatistics.totalVisits());
    assertEquals(threads.length, visitorStatistics.visitsBy(name));
  }
}