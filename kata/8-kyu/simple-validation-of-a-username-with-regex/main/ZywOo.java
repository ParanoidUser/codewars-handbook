interface ZywOo {
  static boolean validateUsr(String s) {
    return s.matches("[a-z0-9_]{4,16}");
  }
}
