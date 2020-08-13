import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

interface Kata {
  static String reverseWords(String original) {
    return stream(original.split("(?<=\\s)|(?=\\s+)")).map(s -> new StringBuilder(s).reverse().toString()).collect(joining());
  }
}
