import static java.util.Arrays.stream;

import java.util.function.Function;

interface Solution {
  static <T, R> Object[][] gridMap(Function<T, R> fn, T[][] list) {
    return stream(list).map(l -> stream(l).map(fn).toArray()).toArray(Object[][]::new);
  }
}