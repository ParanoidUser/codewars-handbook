import static java.util.stream.IntStream.range;

interface Kata {
  static int alternateSqSum(int[] arr) {
    return range(0, arr.length).map(i -> arr[i] * (i % 2 != 0 ? arr[i] : 1)).sum();
  }
}
