import static java.util.stream.IntStream.iterate;

interface Kata {
  static boolean hasLoop(int[] arr) {
    return iterate(0, i -> arr[i]).limit(arr.length + 1).allMatch(i -> i < arr.length);
  }
}