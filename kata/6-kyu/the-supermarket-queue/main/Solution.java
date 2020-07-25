import static java.util.Collections.nCopies;

import java.util.PriorityQueue;

interface Solution {
  static int solveSuperMarketQueue(int[] customers, int n) {
    var queue = new PriorityQueue<>(nCopies(n, 0));
    for (int customer : customers) {
      queue.add(queue.remove() + customer);
    }
    return queue.stream().max(Integer::compareTo).orElse(0);
  }
}
