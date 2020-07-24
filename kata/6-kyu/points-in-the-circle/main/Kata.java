import static java.util.stream.IntStream.rangeClosed;

interface Kata {
  static int pointsNumber(int r) {
    return 4 * (r + rangeClosed(1, r).reduce(0, (s, i) -> s + (int) Math.sqrt(r * r - Math.pow(i, 2)))) + 1;
  }
}
