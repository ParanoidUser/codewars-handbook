import static java.util.stream.IntStream.of;

import java.util.concurrent.atomic.AtomicInteger;

class Kata {
  static int minimumSteps(int[] numbers, int k) {
    var steps = new AtomicInteger();
    of(numbers).sorted().reduce(0, (sum, n) -> sum < k && steps.addAndGet(1) > 0 ? sum + n : sum + n);
    return steps.addAndGet(-1);
  }
}
