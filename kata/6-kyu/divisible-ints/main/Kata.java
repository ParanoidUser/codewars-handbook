import static java.util.stream.IntStream.range;
import static java.util.stream.IntStream.rangeClosed;

interface Kata {
  static int getCount(int n) {
    return range(1, (n + "").length()).flatMap(i -> rangeClosed(0, (n + "").length() - i)
        .map(j -> (j = Integer.parseInt((n + "").substring(j, j + i))) < 1 || n % j > 0 ? 0 : 1)).sum();
  }
}