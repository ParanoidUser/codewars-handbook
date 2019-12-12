import static java.util.stream.Collectors.toList;

import java.util.List;

class findList {
  static List<String> findChildren(List<String> santasList, List<String> children) {
    return santasList.stream().filter(children::contains).distinct().sorted().collect(toList());
  }
}
