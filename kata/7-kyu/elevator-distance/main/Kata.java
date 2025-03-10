import static java.util.stream.IntStream.range;

interface Kata {
  static int elevatorDistance(int[] arr) {
    return range(0, arr.length - 1).reduce(0, (s, i) -> s + Math.abs(arr[i] - arr[i + 1]));
  }
}