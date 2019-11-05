class CodeWars {
  static int strCount(String str, char letter) {
    return (int) str.chars().filter(x -> x == letter).count();
  }
}
