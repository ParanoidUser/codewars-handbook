import static java.util.Arrays.stream;

interface Solution {
  static String toCamelCase(String s) {
    var words = s.split("[-|_]");
    return stream(words, 1, words.length).map(w -> Character.toUpperCase(w.charAt(0)) + w.substring(1)).reduce(words[0], String::concat);
  }
}
