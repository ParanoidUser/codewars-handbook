interface Dinglemouse {
  static String whatTimeIsIt(double angle) {
    return String.format("%02d:%02d", angle < 30 ? 12 : (int) angle / 30, (int) (2 * angle) % 60);
  }
}
