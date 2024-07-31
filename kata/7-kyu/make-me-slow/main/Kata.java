interface Kata {
  static void makeMeSlow() {
    try {
      Thread.sleep(7000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
}