import static java.util.Comparator.comparingInt;
import static java.util.stream.IntStream.of;

interface ClosestToZero {
  static Integer find(int[] arr) {
    var sorted = of(arr).boxed().sorted(comparingInt(Math::abs)).toArray(Integer[]::new);
    return sorted.length < 2 ? sorted[0] : sorted[0] != -sorted[1] ? sorted[0] : null;
  }
}
