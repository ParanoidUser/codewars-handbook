import static java.util.stream.LongStream.rangeClosed;

interface Kata {
  static long[] powersOfTwo(int n) {
    return rangeClosed(0, n).map(i -> 1L << i).toArray();
  }
}