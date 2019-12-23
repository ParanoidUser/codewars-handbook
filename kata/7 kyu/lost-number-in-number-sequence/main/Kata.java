import static java.util.stream.IntStream.of;

class Kata {
  static int findDeletedNumber(int[] arr, int[] mixedArr) {
    return arr.length == mixedArr.length ? 0 : (arr.length + 1) * (arr.length + 2) / 2 - of(mixedArr).sum();
  }
}
