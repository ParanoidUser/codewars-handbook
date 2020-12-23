import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.rangeClosed;

interface Kata {
  static String multiTable(int num) {
    return rangeClosed(1, 10).mapToObj(i -> i + " * " + num + " = " + i * num).collect(joining("\n"));
  }
}