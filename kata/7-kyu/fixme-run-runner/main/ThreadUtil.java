public final class ThreadUtil {

  private ThreadUtil() {}

  static long id1 = -1L;
  static long id2 = -1L;

  static void method1() {
    id1 = Thread.currentThread().getId();
  }

  static void method2() {
    id2 = Thread.currentThread().getId();
  }
}
