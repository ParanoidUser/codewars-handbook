import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

interface Addornot {
  static String addOrNot(String[][] instructions) {
    return stream(instructions).map(i -> "1".equals(i[1]) ? i[0] : "").collect(joining());
  }
}