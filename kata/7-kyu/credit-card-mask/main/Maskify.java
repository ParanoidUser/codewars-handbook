interface Maskify {
  static String maskify(String str) {
    return str.replaceAll(".(?=.{4})", "#");
  }
}
