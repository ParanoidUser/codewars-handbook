import java.util.List;

interface sorter {
  static List<String> sort(List<String> textbooks) {
    return textbooks.stream().sorted(String.CASE_INSENSITIVE_ORDER).toList();
  }
}
