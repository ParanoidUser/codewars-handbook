import static java.util.stream.IntStream.range;

interface Thirteen {
  static long thirt(long n) {
    var arr = new int[]{1, 10, 9, 12, 3, 4};
    var r = new StringBuilder("" + n).reverse();
    long sum = range(0, r.length()).map(i -> arr[i % 6] * (r.charAt(i) - 48)).sum();
    return sum == n ? sum : thirt(sum);
  }
}
