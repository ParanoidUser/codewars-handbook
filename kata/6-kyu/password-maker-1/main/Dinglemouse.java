interface Dinglemouse {
  static String makePassword(int len, boolean flagUpper, boolean flagLower, boolean flagDigit) {
    var password = new StringBuilder();
    int u = 0;
    int l = 0;
    int d = 0;
    while (password.length() < len) {
      if (flagUpper) password.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(u++));
      if (flagLower) password.append("abcdefghijklmnopqrstuvwxyz".charAt(l++));
      if (flagDigit && d < 10) password.append("0123456789".charAt(d++));
    }
    return password.subSequence(0, len).toString();
  }
}