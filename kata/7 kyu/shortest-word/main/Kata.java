import static java.util.stream.Stream.of;

class Kata {
  static int findShort(String s) {
    return of(s.split(" ")).mapToInt(String::length).min().orElse(0);
  }
}
