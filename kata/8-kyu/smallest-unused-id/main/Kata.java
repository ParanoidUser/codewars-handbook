import static java.util.stream.IntStream.of;
import static java.util.stream.IntStream.range;

interface Kata {
  static int nextId(int[] ids) {
    return range(0, ids.length).filter(i -> of(ids).noneMatch(j -> j == i)).findFirst().orElse(ids.length);
  }
}