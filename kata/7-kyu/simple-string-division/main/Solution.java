import static java.util.stream.IntStream.rangeClosed;

interface Solution {
  static long solve(String st, int k) {
    return rangeClosed(0, k).mapToLong(i -> Long.parseLong(st.substring(i, i - k + st.length()))).max().orElse(0);
  }
}