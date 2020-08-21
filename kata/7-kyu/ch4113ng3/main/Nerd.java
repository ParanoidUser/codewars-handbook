interface Nerd {
  static String nerdify(String txt) {
    return txt.replaceAll("[aA]", "4").replaceAll("[eE]", "3").replace("l", "1");
  }
}
