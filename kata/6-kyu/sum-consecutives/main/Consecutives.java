import java.util.LinkedList;
import java.util.List;

interface Consecutives {
  static List<Integer> sumConsecutives(List<Integer> s) {
    var result = new LinkedList<>(List.of(0));
    var prev = s.get(0);
    for (int i : s) {
      if (prev == i) {
        result.addLast(result.removeLast() + i);
      } else {
        result.addLast(i);
        prev = i;
      }
    }
    return result;
  }
}
