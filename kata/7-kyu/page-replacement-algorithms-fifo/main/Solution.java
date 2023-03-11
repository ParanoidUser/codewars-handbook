import java.util.ArrayList;
import java.util.Collections;

interface Solution {
  static int[] fifo(int n, int[] list) {
    var memory = new ArrayList<>(Collections.nCopies(n, -1));
    int p = 0;
    for (int i : list) {
      if (!memory.contains(i)) {
        memory.set(p++, i);
        p %= n;
      }
    }
    return memory.stream().mapToInt(i -> i).toArray();
  }
}