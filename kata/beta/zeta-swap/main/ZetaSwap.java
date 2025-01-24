import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;

interface ZetaSwap {
  static String swapMurder(String suspects) {
    var count = suspects.chars().boxed().collect(groupingBy(c -> c | 32, counting()));
    return suspects.chars().mapToObj(c -> "" + (char) (Character.isLetter(c) && count.get(c | 32) > 1 ? (c > 96 ? 219 : 155) - c : c)).collect(joining());
  }
}