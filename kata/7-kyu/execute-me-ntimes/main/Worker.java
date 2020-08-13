class Worker {
  void execute(Runnable action, int nTimes) {
    int onStart = Thread.activeCount();
    for (int i = 0; i < nTimes; i++) new Thread(action).start();
    while (Thread.activeCount() != onStart);
  }
}
