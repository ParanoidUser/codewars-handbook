import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface CamelCase {
  static String cAmEl(String yourName) {
    return range(0, yourName.length())
        .mapToObj(i -> "" + (i % 2 > 0 ? Character.toLowerCase(yourName.charAt(i)) : Character.toUpperCase(yourName.charAt(i))))
        .collect(joining());
  }
}