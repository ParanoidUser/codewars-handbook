import static java.util.stream.IntStream.of;
import static java.util.stream.IntStream.range;

import java.util.concurrent.atomic.AtomicInteger;

interface Kata {
  static int findEvenIndex(int[] arr) {
    AtomicInteger l = new AtomicInteger();
    AtomicInteger r = new AtomicInteger(of(arr).sum() - arr[0]);
    return l.get() != r.get() ? range(1, arr.length)
        .filter(i -> l.addAndGet(arr[i - 1]) == r.addAndGet(-arr[i]))
        .findFirst().orElse(-1) : 0;
  }
}
