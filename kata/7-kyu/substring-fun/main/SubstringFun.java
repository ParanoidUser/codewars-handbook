import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface SubstringFun {
  static String nthChar(String[] words) {
    return range(0, words.length).mapToObj(i -> "" + words[i].charAt(i)).collect(joining());
  }
}