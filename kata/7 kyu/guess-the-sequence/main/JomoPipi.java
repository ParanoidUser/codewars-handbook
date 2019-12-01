import static java.util.stream.IntStream.rangeClosed;

class JomoPipi {
  static int[] sequence(int x) {
    return rangeClosed(1, x).mapToObj(i -> i + "").sorted().mapToInt(Integer::parseInt).toArray();
  }
}
