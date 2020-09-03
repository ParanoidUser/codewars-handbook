import static java.util.stream.IntStream.of;

interface Kata {
  static int findDeletedNumber(int[] arr, int[] mixedArr) {
    return arr.length == mixedArr.length ? 0 : arr.length * (arr.length + 1) / 2 - of(mixedArr).sum();
  }
}