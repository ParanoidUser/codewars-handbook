import static java.util.stream.LongStream.rangeClosed;

interface Sumpowdig {
  static long[] eqSumPowDig(long hmax, int exp) {
    return rangeClosed(2, hmax)
        .filter(n -> (n + "").chars().mapToLong(d -> (long) Math.pow(d - 48., exp)).sum() == n)
        .toArray();
  }
}
