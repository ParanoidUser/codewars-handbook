import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

interface Solution {
  static boolean tidyNumber(int number) {
    return Integer.parseInt(of(("" + number).split("")).sorted().collect(joining())) == number;
  }
}
