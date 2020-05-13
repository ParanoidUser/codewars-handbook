import static java.util.Arrays.stream;

interface TotalPoints {
  static int points(String[] games) {
    return stream(games).mapToInt(s -> s.charAt(0) - s.charAt(2)).map(m -> m > 0 ? 3 : m < 0 ? 0 : 1).sum();
  }
}
