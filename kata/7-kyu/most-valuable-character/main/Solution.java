import static java.util.Comparator.comparing;

interface Solution {
  static char solve(String s) {
    return (char) s.chars().sorted().boxed()
        .min(comparing(c -> s.indexOf(c) - s.lastIndexOf(c))).orElse(0).intValue();
  }
}