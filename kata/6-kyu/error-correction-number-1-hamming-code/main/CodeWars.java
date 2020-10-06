import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

class CodeWars {
  String encode(String text) {
    return text.chars().mapToObj(Integer::toBinaryString)
        .map(s -> ("0".repeat(8 - s.length()) + s).replaceAll(".", "$0$0$0")).collect(joining());
  }

  String decode(String bits) {
    bits = of(bits.split("(?<=\\G.{3})")).map(s -> s.indexOf('0') != s.lastIndexOf('0') ? "0" : "1").collect(joining());
    return of(bits.split("(?<=\\G.{8})")).map(i -> (char) Integer.parseInt(i, 2) + "").collect(joining());
  }
}