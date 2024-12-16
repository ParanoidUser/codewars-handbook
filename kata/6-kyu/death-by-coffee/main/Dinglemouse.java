import static java.util.stream.IntStream.range;

import java.util.function.ToIntBiFunction;

interface Dinglemouse {
  static int[] coffeeLimits(int year, int month, int day) {
    ToIntBiFunction<int[], Integer> limit = (h, c) -> range(1, 5000)
        .filter(i -> Integer.toHexString(h[0] += c).contains("dead")).findFirst().orElse(0);
    return new int[]{
        limit.applyAsInt(new int[]{10000 * year + 100 * month + day}, 0xCAFE),
        limit.applyAsInt(new int[]{10000 * year + 100 * month + day}, 0xDECAF)
    };
  }
}