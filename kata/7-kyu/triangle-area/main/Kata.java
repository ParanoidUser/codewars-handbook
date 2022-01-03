interface Kata {
  static float tArea(String tStr) {
    return (float) Math.pow(tStr.split("\n").length - 2., 2) / 2;
  }
}