import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface Kata {
  static String tripleTrouble(String one, String two, String three) {
    return range(0, one.length()).mapToObj(i -> "" + one.charAt(i) + two.charAt(i) + three.charAt(i)).collect(joining());
  }
}
