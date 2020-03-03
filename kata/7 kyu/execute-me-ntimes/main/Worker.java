class Worker {
  static void execute(Runnable action, int nTimes) {
    for (int i = 0; i < nTimes; i++) new Thread(action).start();
    while (Thread.activeCount() > 1);
  }
}