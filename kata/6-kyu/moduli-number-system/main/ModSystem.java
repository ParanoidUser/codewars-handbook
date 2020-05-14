import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.of;

interface ModSystem {
  static String fromNb2Str(int n, int[] sys) {
    var applicable = of(sys).reduce((p, m) -> p * m).orElse(0) > n && of(sys).filter(i -> i % 2 == 0).count() < 2;
    return applicable ? "-" + of(sys).mapToObj(i -> n % i + "").collect(joining("--")) + "-" : "Not applicable";
  }
}
