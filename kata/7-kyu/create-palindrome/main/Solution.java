import static java.util.stream.IntStream.range;

interface Solution {
  static boolean solve(String st) {
    return range(0, st.length() / 2).map(i -> Math.abs(st.charAt(i) - st.charAt(st.length() - 1 - i))).allMatch(d -> d < 1 || d == 2);
  }
}