import static java.util.stream.IntStream.range;

import java.util.List;

class Kata {
  List<Integer> CreateList(int number) {
    return range(1, ++number).boxed().toList();
  }
}
