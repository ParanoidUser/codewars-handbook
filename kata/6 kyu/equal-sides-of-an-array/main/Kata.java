import static java.util.stream.IntStream.of;
import static java.util.stream.IntStream.range;

import java.util.concurrent.atomic.AtomicInteger;

class Kata {
  static int findEvenIndex(int[] arr) {
    var left = new AtomicInteger();
    var right = new AtomicInteger(of(arr).sum() - arr[0]);

    if (left.get() == right.get()) {
      return 0;
    }

    return range(1, arr.length)
        .filter(i -> left.addAndGet(arr[i - 1]) == right.addAndGet(-arr[i]))
        .findFirst()
        .orElse(-1);
  }
}
