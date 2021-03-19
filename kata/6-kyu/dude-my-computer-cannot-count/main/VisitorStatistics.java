import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

class VisitorStatistics {
  private final LongAdder counter = new LongAdder();
  private final Map<String, Long> visitorCount = new ConcurrentHashMap<>();

  void visit(String name) {
    counter.increment();
    visitorCount.merge(name, 1L, Long::sum);
  }

  long totalVisits() {
    return counter.sum();
  }

  long visitsBy(String name) {
    return visitorCount.getOrDefault(name, 0L);
  }
}