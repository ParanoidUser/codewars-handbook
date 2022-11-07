import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface Kata {
  static String replace(String s) {
    return range(0, s.length()).mapToObj(i -> map(i, s.charAt(i)) + "").collect(joining());
  }

  private static char map(int pos, char c) {
    var vowels = "aeiou";
    if (vowels.indexOf(Character.toLowerCase(c)) < 0) {
      return c;
    }
    boolean up = Character.isUpperCase(c);
    c = vowels.charAt(pos % 5);
    return up ? Character.toUpperCase(c) : c;
  }
}