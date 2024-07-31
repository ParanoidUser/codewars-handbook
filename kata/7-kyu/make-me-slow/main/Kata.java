interface Kata {
  static void makeMeSlow() {
    try {
      Thread.sleep(7000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}