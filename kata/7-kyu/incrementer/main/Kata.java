import static java.util.stream.IntStream.range;

interface Kata {
  static int[] incrementer(int[] n) {
    return range(0, n.length).map(i -> (n[i] + i + 1) % 10).toArray();
  }
}