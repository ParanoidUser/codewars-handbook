import static java.util.stream.IntStream.iterate;

interface NextNumber {
  static int nextInteger(int n) {
    return iterate(n + 1, i -> i > 1, i -> i + 1)
        .filter(i -> (i + "").chars().noneMatch(d -> (n + "").contains(((char) d) + "")))
        .findFirst().orElse(0);
  }
}