import static java.util.stream.IntStream.range;

import java.util.concurrent.atomic.AtomicInteger;

class CircleSorted {
  boolean isCircleSorted(int[] a) {
    var count = new AtomicInteger();
    return range(0, a.length).noneMatch(i -> a[i] > a[++i % a.length] && count.getAndIncrement() > 0);
  }
}
