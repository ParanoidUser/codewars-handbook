import static java.util.stream.IntStream.range;

interface DD {
  static boolean isDD(int n) {
    return range(1, 9)
        .mapToObj(i -> ("" + n).replaceAll("[^" + i + "]", ""))
        .anyMatch(s -> !s.isEmpty() && s.length() == s.charAt(0) - 48);
  }
}
