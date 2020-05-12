import static java.util.Arrays.stream;

interface ReverseWords {
  static String reverseWords(String str) {
    return stream(str.split(" ")).reduce((x, y) -> y + " " + x).orElse("");
  }
}
