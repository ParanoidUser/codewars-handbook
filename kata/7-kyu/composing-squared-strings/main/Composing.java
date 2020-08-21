import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface Composing {
  static String compose(String s1, String s2) {
    var l1 = s1.split("\n");
    var l2 = s2.split("\n");
    return range(0, l1.length)
        .mapToObj(i -> l1[i].substring(0, i + 1) + l2[l1.length - 1 - i].substring(0, l1.length - i))
        .collect(joining("\n"));
  }
}
