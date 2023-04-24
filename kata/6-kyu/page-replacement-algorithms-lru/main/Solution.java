import java.util.Collections;
import java.util.LinkedList;

interface Solution {
  static int[] lru(int n, int[] list) {
    var memory = new LinkedList<>(Collections.nCopies(n, -1));
    var recent = new LinkedList<Integer>();
    for (int i : list) {
      if (memory.contains(i)) {
        recent.remove((Integer) i);
      } else {
        memory.set(memory.indexOf(memory.contains(-1) ? -1 : recent.removeFirst()), i);
      }
      recent.add(i);
    }
    return memory.stream().mapToInt(i -> i).toArray();
  }
}