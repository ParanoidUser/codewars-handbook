import static java.util.stream.LongStream.iterate;

interface UserSolution {
  static long[] oddRow(int n) {
    return iterate((long) n * (n - 1) + 1, i -> i + 2).limit(n).toArray();
  }
}
