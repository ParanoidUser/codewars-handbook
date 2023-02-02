import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summarizingInt;
import static java.util.stream.Stream.of;

interface Solution {
  static boolean pairOfShoes(Shoe[] shoes) {
    return of(shoes).collect(groupingBy(Shoe::size, summarizingInt(s -> s.foot() == Foot.LEFT ? 1 : -1)))
        .values().stream().allMatch(c -> c.getSum() == 0);
  }
}

record Shoe(Foot foot, int size) { }
enum Foot {LEFT, RIGHT}