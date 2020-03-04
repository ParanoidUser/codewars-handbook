import static java.util.stream.IntStream.rangeClosed;
class Kata {
  static int pointsNumber(int r) {
    return 4 * (r + rangeClosed(1, r).reduce(0, (s, i) -> s + (int) Math.sqrt(r * r - i * i))) + 1;
  }
}
