import static java.util.stream.IntStream.range;

interface Solution {
  static String solve(String s) {
    var reverse = new StringBuilder(s.replace(" ", "")).reverse();
    range(0, s.length()).filter(i -> s.charAt(i) == ' ').forEach(i -> reverse.insert(i, ' '));
    return reverse.toString();
  }
}