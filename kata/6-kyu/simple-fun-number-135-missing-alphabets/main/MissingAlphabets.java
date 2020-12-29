import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.of;
import static java.util.stream.IntStream.rangeClosed;
import static org.apache.commons.lang3.StringUtils.countMatches;

interface MissingAlphabets {
  static String find(String text) {
    int[] occur = rangeClosed('a', 'z').map(c -> countMatches(text, (char) c + "")).toArray();
    int max = of(occur).max().orElse(0);
    return rangeClosed('a', 'z').mapToObj(c -> ((char) c + "").repeat(max - occur[c - 97])).collect(joining());
  }
}
