import static java.util.stream.IntStream.of;

class BitsBattle {
  static String bitsBattle(int[] numbers) {
    long score = of(numbers).filter(n -> n != 0)
                            .map(n -> -Integer.bitCount(n) + (n % 2 != 0 ? 0 : 32 - Integer.numberOfLeadingZeros(n))).sum();
    return score == 0 ? "tie" : score > 0 ? "evens win" : "odds win";
  }
}
