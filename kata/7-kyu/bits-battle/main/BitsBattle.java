import static java.util.stream.IntStream.of;

interface BitsBattle {
  static String bitsBattle(int[] numbers) {
    var score = of(numbers).filter(n -> n > 0).map(n -> -Integer.bitCount(n) + (n % 2 > 0 ? 0 : 32 - Integer.numberOfLeadingZeros(n))).sum();
    return score > 0 ? "evens win" : score < 0 ? "odds win" : "tie";
  }
}
