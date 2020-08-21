import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

interface CWars {
  static String initials(String name) {
    return stream(name.split(" ")).map(s -> s.substring(0, 1).toUpperCase()).collect(joining("."))
        + name.substring(name.lastIndexOf(' ') + 2);
  }
}
