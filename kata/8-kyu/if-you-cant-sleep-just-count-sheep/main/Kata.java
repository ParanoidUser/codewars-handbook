import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.rangeClosed;

interface Kata {
  static String countingSheep(int num) {
    return rangeClosed(1, num).mapToObj(i -> i + " sheep...").collect(joining());
  }
}
