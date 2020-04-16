import static java.util.stream.Collectors.toList;
import static java.util.stream.Stream.concat;

import java.util.Collection;
import java.util.List;

class Kata {
  static List<Character> diff(Collection<Character> a, Collection<Character> b) {
    return concat(a.stream(), b.stream()).distinct().filter(c -> !a.contains(c) || !b.contains(c)).sorted().collect(toList());
  }
}
