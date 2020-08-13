interface XO {
  static boolean getXO(String str) {
    return str.toLowerCase().replace("x", "").length() == str.toLowerCase().replace("o", "").length();
  }
}
