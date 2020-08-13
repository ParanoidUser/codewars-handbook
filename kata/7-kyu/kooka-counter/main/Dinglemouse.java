interface Dinglemouse {
  static int kookaCounter(String laughing) {
    return laughing.replace("a", "").replaceAll("h+", "1").replaceAll("H+", "1").length();
  }
}
