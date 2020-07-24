import java.util.LinkedList;
import java.util.List;

interface Consecutives {
  static List<Integer> sumConsecutives(List<Integer> s) {
    var result = new LinkedList<>(List.of(0));
    var prev = s.get(0);
    for (int i : s) {
      result.addLast(prev == i ? result.removeLast() + i : (prev = i));
    }
    return result;
  }
}
