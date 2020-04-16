import java.util.stream.Stream;

class Kata {
  static int findLongest(String str) {
    return Stream.of(str.split(" ")).mapToInt(String::length).max().orElse(0);
  }
}
