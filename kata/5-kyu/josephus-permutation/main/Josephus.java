import java.util.List;

import static java.util.stream.IntStream.iterate;

interface Josephus {
  static <T> List<T> josephusPermutation(List<T> l, int k) {
    return iterate((k - 1) % Math.max(l.size(), 1), i -> !l.isEmpty(), i -> (i + k - 1) % Math.max(l.size(), 1))
            .mapToObj(l::remove).toList();
  }
}