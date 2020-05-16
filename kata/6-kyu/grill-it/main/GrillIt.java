interface GrillIt {
  static String grille(String msg, int code) {
    return msg.length() > 0 ? grille(msg.substring(0, msg.length() - 1), code / 2) + (code % 2 > 0 ? msg.charAt(msg.length() - 1) : "") : "";
  }
}