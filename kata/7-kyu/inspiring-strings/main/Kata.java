import static java.util.Arrays.stream;

interface Kata {
  static String longestWord(String wordString) {
    return stream(wordString.split(" ")).reduce((a, b) -> a.length() > b.length() ? a : b).orElse("");
  }
}
