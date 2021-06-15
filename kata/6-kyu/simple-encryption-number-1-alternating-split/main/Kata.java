interface Kata {
  static String encrypt(String text, int n) {
    while (n-- > 0) {
      var cypher = new StringBuilder();
      for (var i = 0; i < text.length() - 1; i += 2) {
        cypher.insert(i / 2, text.charAt(i + 1)).append(text.charAt(i));
      }
      if (text.length() % 2 > 0) {
        cypher.append(text.charAt(text.length() - 1));
      }
      text = cypher.toString();
    }
    return text;
  }

  static String decrypt(String encryptedText, int n) {
    while (n-- > 0) {
      var plain = new StringBuilder();
      for (var i = 0; i < encryptedText.length() / 2; i++) {
        plain.append(encryptedText.charAt(i + encryptedText.length() / 2)).append(encryptedText.charAt(i));
      }
      if (encryptedText.length() % 2 > 0) {
        plain.append(encryptedText.charAt(encryptedText.length() - 1));
      }
      encryptedText = plain.toString();
    }
    return encryptedText;
  }
}
