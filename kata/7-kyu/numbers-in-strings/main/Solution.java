import static java.util.stream.Stream.of;

interface Solution {
  static int solve(String s) {
    return of(s.split("\\D")).mapToInt(n -> n.isEmpty() ? 0 : Integer.parseInt(n)).max().orElse(0);
  }
}