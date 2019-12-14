import static java.util.stream.IntStream.of;

import java.util.concurrent.atomic.AtomicInteger;

class Dinglemouse {
  static int riders(int[] stations) {
    var riders = new AtomicInteger(1);
    of(stations).reduce((ml, dist) -> (ml += dist) > 100 && riders.addAndGet(1) > 0 ? dist : ml);
    return riders.get();
  }
}
