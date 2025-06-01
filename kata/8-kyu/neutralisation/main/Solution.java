import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface Solution {
  static String neutralise(String s1, String s2) {
    return range(0, s1.length()).mapToObj(i -> s1.charAt(i) == s2.charAt(i) ? s1.charAt(i) + "" : "0").collect(joining());
  }
}