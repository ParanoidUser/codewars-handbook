import static java.util.stream.IntStream.of;

import java.util.function.IntFunction;

interface Kata {
  static IntFunction<int[]> multiplyAll(int[] array) {
    return n -> of(array).map(i -> n * i).toArray();
  }
}