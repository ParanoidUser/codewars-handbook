import static java.util.stream.IntStream.iterate;

interface Kata {
  static int singleDigit(int n) {
    return iterate(n, Integer::bitCount).filter(i -> i < 10).findFirst().orElse(0);
  }
}