import static java.util.stream.IntStream.range;

class PangramChecker {
  static boolean check(String sentence) {
    return range(65, 91).noneMatch(c -> sentence.toUpperCase().indexOf((char) c) < 0);
  }
}
