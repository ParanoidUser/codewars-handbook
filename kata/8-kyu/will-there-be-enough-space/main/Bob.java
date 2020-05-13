interface Bob {
  static int enough(int cap, int on, int wait) {
    return Math.max(0, wait + on - cap);
  }
}
