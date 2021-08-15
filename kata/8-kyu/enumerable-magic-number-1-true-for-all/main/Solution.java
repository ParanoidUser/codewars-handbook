import static java.util.stream.IntStream.of;

import java.util.function.IntPredicate;

interface Solution {
  static boolean all(int[] list, IntPredicate predicate) {
    return of(list).allMatch(predicate);
  }
}