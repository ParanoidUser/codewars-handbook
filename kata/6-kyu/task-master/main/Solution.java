import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

interface Solution {
  static int taskMaster(Collection<Callable<Integer>> functions) {
    int sum = 0;
    var threadPool = Executors.newFixedThreadPool(64);
    try {
      for (var future : threadPool.invokeAll(functions)) {
        sum += future.get();
      }
    } catch (Exception ignored) {
    } finally {
      threadPool.shutdown();
    }
    return sum;
  }
}