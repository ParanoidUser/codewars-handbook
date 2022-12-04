interface CC {
  static int charCount(String str, char c) {
    return (int) str.toLowerCase().chars().filter(i -> i == Character.toLowerCase(c)).count();
  }
}