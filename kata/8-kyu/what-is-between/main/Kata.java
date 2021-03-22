import static java.util.stream.IntStream.rangeClosed;

interface Kata {
  static int[] between(int a, int b) {
    return rangeClosed(a, b).toArray();
  }
}