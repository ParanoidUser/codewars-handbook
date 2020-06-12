import static java.util.stream.Stream.of;

interface ConsonantValue {
  static int solve(String s) {
    return of(s.split("[aeiou]")).mapToInt(con -> con.chars().map(c -> c - 96).sum()).max().orElse(0);
  }
}
