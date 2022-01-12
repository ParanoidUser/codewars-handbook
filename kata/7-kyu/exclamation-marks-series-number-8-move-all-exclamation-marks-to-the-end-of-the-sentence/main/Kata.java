interface Kata {
  static String remove(String s) {
    return s.replace("!", "") + s.replaceAll("[^!]", "");
  }
}