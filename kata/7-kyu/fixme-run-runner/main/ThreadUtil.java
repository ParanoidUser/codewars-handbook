public final class ThreadUtil {

  private ThreadUtil() {}

  private static long id1 = -1L;
  private static long id2 = -1L;

  static void method1() {
    id1 = Thread.currentThread().getId();
  }

  static void method2() {
    id2 = Thread.currentThread().getId();
  }

  static boolean checkThreads() {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
    return id1 != -1 && id2 != -1 && id1 != id2;
  }
}
