import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

class Solution {
  static String removeDuplicateWords(String s) {
    return stream(s.split(" ")).distinct().collect(joining(" "));
  }
}
