import static java.util.stream.Stream.iterate;

interface Solution {
  static String solve(int n) {
    return iterate(new String[]{"0", "01"}, s -> new String[]{s[1], s[1] + s[0]}).limit(++n).reduce((x, y) -> y).orElse(new String[0])[0];
  }
}