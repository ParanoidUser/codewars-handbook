interface PasswordHider {
  static String hidePasswordFromConnection(String urlString) {
    var hidden = new StringBuilder(urlString);
    for (int i = hidden.indexOf("password") + 9; i < urlString.length() && hidden.charAt(i) != '&'; i++) {
      hidden.setCharAt(i, '*');
    }
    return hidden.toString();
  }
}
