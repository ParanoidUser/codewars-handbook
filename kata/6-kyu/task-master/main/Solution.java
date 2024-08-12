import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

interface Solution {
  static int taskMaster(Collection<Callable<Integer>> functions) {
    var threadPool = Executors.newFixedThreadPool(64);
    try {
      int sum = 0;
      for (var future : threadPool.invokeAll(functions)) {
        sum += future.get();
      }
      return sum;
    } catch (Exception cause) {
      throw new RuntimeException(cause);
    } finally {
      threadPool.shutdown();
    }
  }
}