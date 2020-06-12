import static java.util.stream.IntStream.iterate;

import java.util.concurrent.atomic.AtomicLong;

interface Checkchoose {
  static long checkchoose(long m, long n) {
    var colors = new AtomicLong(1);
    return iterate(0, i -> i < n, i -> i + 1)
        .filter(i -> colors.getAndSet(colors.get() * (n - i) / (i + 1)) == m).findFirst()
        .orElse(-1);
  }
}
