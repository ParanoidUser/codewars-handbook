class Worker {
  static void execute(Runnable action, int nTimes) {
    Thread last = null;
    for (int i = 0; i < nTimes; i++) {
      last = new Thread(action);
      last.start();
    }
    try {
      if (last != null) last.join();
    } catch (Exception ignore) {
    }
  }
}
