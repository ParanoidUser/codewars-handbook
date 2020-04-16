import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

class Kata {
  static String rakeGarden(String garden) {
    return of(garden.split(" ")).map(s -> s.equals("rock") ? s : "gravel").collect(joining(" "));
  }
}
