import static java.util.stream.IntStream.iterate;

interface SuffPref {
  static int solve(String s) {
    return iterate(s.length() / 2, i -> i > 0, i -> i - 1)
        .filter(i -> s.substring(0, i).equals(s.substring(s.length() - i)))
        .findFirst().orElse(0);
  }
}