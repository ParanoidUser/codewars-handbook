import java.util.stream.IntStream;

class ZywOo {
  static int[] multipleOfIndex(int[] a) {
    return IntStream.range(1, a.length).filter(i -> a[i] % i == 0).map(i -> a[i]).toArray();
  }
}
