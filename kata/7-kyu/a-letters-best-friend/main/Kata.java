interface Kata {
  static boolean bestFriend(String txt, char a, char b) {
    return !txt.matches(".*" + a + "(?!" + b + ").*");
  }
}