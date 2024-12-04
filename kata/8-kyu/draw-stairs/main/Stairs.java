import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface Stairs {
  static String draw(int n) {
    return range(0, n).mapToObj(i -> " ".repeat(i) + "I").collect(joining("\n"));
  }
}