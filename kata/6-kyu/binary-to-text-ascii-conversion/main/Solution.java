import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.iterate;

interface Solution {
  static String binaryToText(String binary) {
    return iterate(0, i -> i < binary.length(), i -> i + 8)
        .mapToObj(i -> "" + (char) Integer.parseInt(binary.substring(i, i + 8), 2))
        .collect(joining());
  }
}
