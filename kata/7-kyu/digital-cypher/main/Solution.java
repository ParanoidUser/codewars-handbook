import static java.util.stream.IntStream.range;

interface Solution {
  static int[] encode(String m, int k) {
    return range(0, m.length()).map(i -> m.charAt(i) + (k + "").charAt(i % ((int) Math.log10(k) + 1)) - 144).toArray();
  }
}