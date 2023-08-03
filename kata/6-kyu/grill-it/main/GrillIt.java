interface GrillIt {
  static String grille(String msg, int code) {
    return !msg.isEmpty() ? grille(msg.substring(0, msg.length() - 1), code / 2) + (code % 2 > 0 ? msg.charAt(msg.length() - 1) : "") : "";
  }
}