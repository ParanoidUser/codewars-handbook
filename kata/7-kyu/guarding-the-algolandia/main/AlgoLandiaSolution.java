import static java.util.regex.Pattern.compile;
import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface AlgoLandiaSolution {
  static int findNeededGuards(boolean[] k) {
    return (int) compile("1{2}").matcher(range(0, k.length).mapToObj(b -> k[b] ? "0" : "1").collect(joining())).results().count();
  }
}
