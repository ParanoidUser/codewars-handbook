import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

interface Meeting {
  static String meeting(String s) {
    return of(s.toUpperCase().split(";")).map(g -> g.replaceAll("(\\w+):(\\w+)", "($2, $1)")).sorted().collect(joining());
  }
}
