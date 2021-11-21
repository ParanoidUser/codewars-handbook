interface Solution {
  static String doubleChar(String s) {
    return s.replaceAll(".", "$0$0");
  }
}