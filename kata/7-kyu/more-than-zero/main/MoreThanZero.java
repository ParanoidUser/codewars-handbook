interface MoreThanZero {
  static String corrections(int x) {
    return x + " is " + (x > 0 ? "more" : "equal to or less") + " than zero.";
  }
}