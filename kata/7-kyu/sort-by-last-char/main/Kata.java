import static java.util.Comparator.comparingInt;
import static java.util.stream.Stream.of;

interface Kata {
  static String[] last(String x) {
    return of(x.split(" ")).sorted(comparingInt(s -> s.charAt(s.length() - 1))).toArray(String[]::new);
  }
}