import static java.util.stream.Stream.iterate;

class BackspacesInString {
  String cleanString(String s) {
    return iterate(s, i -> i.replaceFirst(".?#", "")).dropWhile(i -> i.matches(".*#.*")).findFirst().orElse("");
  }
}
