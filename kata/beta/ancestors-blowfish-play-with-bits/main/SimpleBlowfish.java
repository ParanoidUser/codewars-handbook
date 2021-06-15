class SimpleBlowfish {
  String encrypt(String plainText, String password) {
    if (password.isEmpty()) return plainText;
    var chars = plainText.toCharArray();
    for (var i = 0; i < plainText.length(); i++) {
      chars[i] = (char) (plainText.charAt(i) ^ password.charAt(i % password.length()) << 8);
    }
    return new String(chars);
  }
}