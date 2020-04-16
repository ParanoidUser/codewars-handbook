import java.util.Arrays;

class ReverseWords {
  static String reverseWords(String str) {
    return Arrays.stream(str.split(" ")).reduce((x, y) -> y + " " + x).orElse("");
  }
}
