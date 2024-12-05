import static java.util.stream.IntStream.range;

interface Kata {
  static double vectorAffinity(int[] xs, int[] ys) {
    return xs.length > 0 ? (double) range(0, Math.min(xs.length, ys.length)).filter(i -> xs[i] == ys[i]).count() / Math.max(xs.length, ys.length) : 1;
  }
}