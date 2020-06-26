interface Dinglemouse {
  static String makePassword(int len, boolean flagUpper, boolean flagLower, boolean flagDigit) {
    var password = new StringBuilder();
    for (int u = 0, l = 0, d = 0; password.length() < len;) {
      if (flagUpper) password.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(u++));
      if (flagLower) password.append("abcdefghijklmnopqrstuvwxyz".charAt(l++));
      if (flagDigit && d < 10) password.append("0123456789".charAt(d++));
    }
    return password.subSequence(0, len).toString();
  }
}