import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;

interface Kata {
  static String hasSubpattern(String string) {
    var occurs = string.chars().mapToObj(c -> (char) c + "").collect(groupingBy(identity(), counting()));
    long gcd = occurs.values().stream().reduce(0L, Kata::gcd);
    return occurs.entrySet().stream().map(e -> e.getKey().repeat((int) (e.getValue() / gcd))).sorted().collect(joining());
  }

  private static long gcd(long x, long y) {
    return x % y > 0 ? gcd(y, x % y) : y;
  }
}