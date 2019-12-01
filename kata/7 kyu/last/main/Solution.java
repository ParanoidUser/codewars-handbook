import java.util.List;

class Solution {
  static <T> T last(List<T> list) {
    return list.get(list.size() - 1);
  }

  static char last(String string) {
    return string.charAt(string.length() - 1);
  }

  static <T> T last(T... list) {
    return list[list.length - 1];
  }
}
