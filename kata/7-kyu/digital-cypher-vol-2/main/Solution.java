import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface Solution {
  static String decode(int[] code, int key) {
    String s = "" + key;
    return range(0, code.length).mapToObj(i -> "" + (char) (code[i] - s.charAt(i % s.length()) + 144)).collect(joining());
  }
}