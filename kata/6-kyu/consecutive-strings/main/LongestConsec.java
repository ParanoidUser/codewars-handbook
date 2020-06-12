import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

interface LongestConsec {
  static String longestConsec(String[] strarr, int k) {
    String max = "";
    for (int i = 0; k > 0 && i <= strarr.length - k; i++) {
      String s = stream(strarr, i, i + k).collect(joining());
      if (s.length() > max.length()) {
        max = s;
      }
    }
    return max;
  }
}
