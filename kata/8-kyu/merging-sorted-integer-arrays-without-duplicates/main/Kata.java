import static java.util.stream.IntStream.*;

class Kata {
  static int[] mergeArrays(int[] a, int[] b) {
    return concat(of(a), of(b)).sorted().distinct().toArray();
  }
}
