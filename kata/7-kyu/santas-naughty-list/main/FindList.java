import java.util.List;

interface FindList {
  static List<String> findChildren(List<String> santasList, List<String> children) {
    return santasList.stream().filter(children::contains).distinct().sorted().toList();
  }
}
