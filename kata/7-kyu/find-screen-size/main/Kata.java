interface Kata {
  static String findScreenHeight(int width, String ratio) {
    return width + "x" + width * Integer.parseInt(ratio.split(":")[1]) / Integer.parseInt(ratio.split(":")[0]);
  }
}
