import static java.util.stream.Stream.of;

interface Kata {
  static int findShort(String s) {
    return of(s.split(" ")).mapToInt(String::length).min().orElse(0);
  }
}
