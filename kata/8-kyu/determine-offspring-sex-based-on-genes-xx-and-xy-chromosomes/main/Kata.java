interface Kata {
  static String chromosomeCheck(String s) {
    return "Congratulations! You're going to have a " + (s.contains("Y") ? "son." : "daughter.");
  }
}
