import static java.util.stream.Collectors.toList;

import java.util.List;

class sorter {
  static List<String> sort(List<String> textbooks) {
    return textbooks.stream().sorted(String.CASE_INSENSITIVE_ORDER).collect(toList());
  }
}
