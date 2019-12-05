import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.rangeClosed;

import java.util.List;

class LineNumbering {
  static List<String> number(List<String> lines) {
    return rangeClosed(1, lines.size()).mapToObj(i -> i + ": " + lines.get(i - 1)).collect(toList());
  }
}
