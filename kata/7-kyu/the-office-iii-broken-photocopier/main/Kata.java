import static java.util.stream.Collectors.joining;

interface Kata {
  static String broken(String x) {
    return x.chars().mapToObj(c -> c == 48 ? "1" : "0").collect(joining());
  }
}
