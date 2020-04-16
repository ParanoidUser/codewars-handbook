import static java.util.stream.Stream.of;

class ConsonantValue {
  static int solve(String s) {
    return of(s.split("[aeiou]")).mapToInt(con -> con.chars().map(c -> c - 96).sum()).max().orElse(0);
  }
}
