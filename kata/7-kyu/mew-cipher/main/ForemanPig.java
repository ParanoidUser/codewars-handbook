import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface ForemanPig {
  static String decipher(String[] code) {
    return range(0, code[0].length())
        .map(i -> range(0, code.length).reduce(0, (s, j) -> s + (code[j].charAt(i) & 31)) / code.length)
        .mapToObj(c -> (char) (c > 0 ? c + 96 : 32) + "").collect(joining());
  }
}