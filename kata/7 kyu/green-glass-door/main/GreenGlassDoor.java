class GreenGlassDoor {
  static boolean stepThroughWith(String s) {
    return s.matches(".*(\\w)\\1.*");
  }
}
