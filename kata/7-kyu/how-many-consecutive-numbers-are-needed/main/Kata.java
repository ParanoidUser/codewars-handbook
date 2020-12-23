import static java.util.stream.IntStream.of;

interface Kata {
  static int consecutive(int[] arr) {
    return (arr = of(arr).sorted().toArray()).length > 0 ? arr[arr.length - 1] - arr[0] - arr.length + 1 : 0;
  }
}