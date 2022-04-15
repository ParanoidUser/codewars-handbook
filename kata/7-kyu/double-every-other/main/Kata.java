import static java.util.stream.IntStream.range;

interface Kata {
  static int[] doubleEveryOther(int[] a) {
    return range(0, a.length).map(i -> a[i] * (1 + i % 2)).toArray();
  }
}