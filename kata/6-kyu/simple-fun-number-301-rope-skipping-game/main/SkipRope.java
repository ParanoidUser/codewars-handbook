import static java.util.stream.IntStream.rangeClosed;

interface SkipRope {
  static int tiaosheng(int[] fail) {
    return 60 - rangeClosed(1, fail.length).map(i -> 3 * i + fail[i - 1]).map(n -> Math.min(63 - Math.min(n, 63), 3)).sum();
  }
}