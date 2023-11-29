import static java.math.BigInteger.valueOf;
import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.iterate;
import static java.util.stream.IntStream.of;

interface SumOfDivided {
  static String sumOfDivided(int[] l) {
    return iterate(2, i -> i < 99878, i -> valueOf(i).nextProbablePrime().intValue())
        .filter(p -> of(l).anyMatch(j -> j % p == 0)).boxed()
        .map(p -> "(" + p + " " + of(l).filter(j -> j % p == 0).sum() + ")")
        .collect(joining());
  }
}