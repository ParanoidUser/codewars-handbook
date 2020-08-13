interface Printer {
  static String printerError(String s) {
    return s.replaceAll("[a-m]", "").length() + "/" + s.length();
  }
}
