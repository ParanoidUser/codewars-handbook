import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

class LongestConsec {
  static String longestConsec(String[] strarr, int k) {
    if (k < 1) return "";

    String max = "";
    for (int i = 0; i <= strarr.length - k; i++) {
      String s = stream(strarr, i, i + k).collect(joining());
      if (s.length() > max.length()) {
        max = s;
      }
    }
    return max;
  }
}
