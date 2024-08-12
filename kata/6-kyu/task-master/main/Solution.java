import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

interface Solution {
  static int taskMaster(Collection<Callable<Integer>> functions) {
    var threadPool = Executors.newFixedThreadPool(64);
    int sum = 0;
    try {
      for (var future : threadPool.invokeAll(functions)) {
        sum += future.get();
      }
    } catch (Exception ignored) {
      Thread.currentThread().interrupt();
    } finally {
      threadPool.shutdown();
    }
    return sum;
  }
}