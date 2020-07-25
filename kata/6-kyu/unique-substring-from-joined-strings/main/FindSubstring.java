import static java.util.Arrays.stream;

interface FindSubstring {
  static int longestSubstring(String a, String b) {
    var s = a.chars().mapToObj(c -> "" + (char) c).filter(b::contains).reduce(a + b + a, (x, y) -> x.replace(y, "_"));
    return stream(s.split("_")).mapToInt(w -> Math.min((a + b).length(), w.length())).max().orElse(0);
  }
}
