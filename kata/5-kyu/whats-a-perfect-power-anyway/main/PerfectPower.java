import static java.util.stream.IntStream.rangeClosed;

interface PerfectPower {
  static int[] isPerfectPower(int n) {
    return rangeClosed(2, 9)
            .mapToObj(i -> new int[]{(int) Math.round(Math.pow(n, 1. / i)), i})
            .filter(mk -> n > 1 && Math.pow(mk[0], mk[1]) == n)
            .findFirst().orElse(null);
  }
}