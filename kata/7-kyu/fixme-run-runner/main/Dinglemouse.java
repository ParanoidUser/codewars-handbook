interface Dinglemouse {
  static void runRunners() {
    new Thread(ThreadUtil::method1).start();
    new Thread(ThreadUtil::method2).start();
  }
}