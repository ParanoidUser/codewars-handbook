interface Kata {
  static String findInQueue(String[] queue, int n) {
    return queue[--n];
  }
}