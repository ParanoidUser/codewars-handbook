import static java.util.function.Predicate.not;
import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface Kata {
  static String expandedForm(int num) {
    return range(0, (num + "").length())
        .mapToObj(i -> (num + "").charAt(i) + "0".repeat((num + "").length() - 1 - i))
        .filter(not(c -> c.matches("0+")))
        .collect(joining(" + "));
  }
}
