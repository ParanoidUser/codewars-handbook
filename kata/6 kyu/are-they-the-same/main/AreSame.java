import static java.util.stream.IntStream.of;

import java.util.Arrays;

class AreSame {
  static boolean comp(int[] a, int[] b) {
    return b != null && Arrays.equals(of(a).map(n -> n * n).sorted().toArray(), of(b).sorted().toArray());
  }
}
