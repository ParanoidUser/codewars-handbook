import static java.util.stream.IntStream.range;

interface ZywOo {
  static int[] multipleOfIndex(int[] a) {
    return range(1, a.length).filter(i -> a[i] % i == 0).map(i -> a[i]).toArray();
  }
}
