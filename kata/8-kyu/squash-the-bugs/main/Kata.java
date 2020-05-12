import static java.util.stream.Stream.of;

interface Kata {
  static int findLongest(String str) {
    return of(str.split(" ")).mapToInt(String::length).max().orElse(0);
  }
}
