import static java.util.stream.IntStream.rangeClosed;

import java.util.List;

interface LineNumbering {
  static List<String> number(List<String> lines) {
    return rangeClosed(1, lines.size()).mapToObj(i -> i + ": " + lines.get(i - 1)).toList();
  }
}
