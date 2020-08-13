import static java.util.stream.IntStream.rangeClosed;

interface JomoPipi {
  static int[] sequence(int x) {
    return rangeClosed(1, x).mapToObj(i -> i + "").sorted().mapToInt(Integer::parseInt).toArray();
  }
}
