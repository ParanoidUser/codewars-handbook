import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

interface Order {
  static String order(String words) {
    return of(words.split(" ")).sorted(comparing(a -> Integer.parseInt(a.replaceAll("\\D", "")))).collect(joining(" "));
  }
}
