import static java.util.stream.Stream.concat;

import java.util.Collection;
import java.util.List;

interface Kata {
  static List<Character> diff(Collection<Character> a, Collection<Character> b) {
    return concat(a.stream(), b.stream()).distinct().filter(c -> !a.contains(c) || !b.contains(c)).sorted().toList();
  }
}
