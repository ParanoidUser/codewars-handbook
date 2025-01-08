import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface GenerateC {
  static String generateC(int size) {
    return range(0, 5 * size).mapToObj(r -> "C".repeat(size * (r < size || r > 4 * size - 1 ? 5 : 1))).collect(joining("\n"));
  }
}