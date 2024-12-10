import static java.util.stream.IntStream.of;

interface Kata {
  static int missingNo(int[] nums) {
    return of(nums).reduce(5050, (s, n) -> s - n);
  }
}