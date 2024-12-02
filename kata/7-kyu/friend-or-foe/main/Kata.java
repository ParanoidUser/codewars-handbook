import java.util.List;

interface Kata {
  static List<String> friend(List<String> names) {
    return names.stream().filter(s -> s.length() == 4).toList();
  }
}