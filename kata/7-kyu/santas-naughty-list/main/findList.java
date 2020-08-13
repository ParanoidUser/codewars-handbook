import static java.util.stream.Collectors.toList;

import java.util.List;

interface findList {
  static List<String> findChildren(List<String> santasList, List<String> children) {
    return santasList.stream().filter(children::contains).distinct().sorted().collect(toList());
  }
}
