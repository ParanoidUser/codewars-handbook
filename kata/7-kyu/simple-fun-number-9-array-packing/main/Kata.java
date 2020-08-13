import static java.util.stream.IntStream.range;

interface Kata {
  static long arrayPacking(int[] arr) {
    return range(0, arr.length).mapToLong(i -> (long) arr[i] << (i * 8)).sum();
  }
}
