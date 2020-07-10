package kata;

public interface Solution {
  static String capitalize(String s, int[] ind) {
    for (int i : ind) {
      if (i < s.length()) {
        s = s.substring(0, i) + (char) (s.charAt(i) - 32) + s.substring(i + 1);
      }
    }
    return s;
  }
}