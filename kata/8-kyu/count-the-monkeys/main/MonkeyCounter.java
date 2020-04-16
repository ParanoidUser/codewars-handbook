import static java.util.stream.IntStream.rangeClosed;

class MonkeyCounter {
  static int[] monkeyCount(int n) {
    return rangeClosed(1, n).toArray();
  }
}
