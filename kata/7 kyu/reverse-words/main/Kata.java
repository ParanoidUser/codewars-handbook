import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

class Kata {
  static String reverseWords(String original) {
    return stream(original.split("(?<=\\s)|(?=\\s+)")).map(str -> new StringBuilder(str).reverse().toString()).collect(joining());
  }
}
