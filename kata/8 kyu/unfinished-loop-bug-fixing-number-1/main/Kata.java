import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;

import java.util.List;

class Kata {
  static List<Integer> CreateList(int number) {
    return range(1, ++number).boxed().collect(toList());
  }
}
