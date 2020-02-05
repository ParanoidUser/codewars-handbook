class Kata {
  static String encrypt(String text, int n) {
    while (n-- > 0) {
      String left = "", right = "";
      for (int i = 0; i < text.length() - 1; i += 2) {
        right += text.charAt(i);
        left += text.charAt(i + 1);
      }
      if (text.length() % 2 > 0) {
        right += text.charAt(text.length() - 1);
      }
      text = left + right;
    }
    return text;
  }

  static String decrypt(String encryptedText, int n) {
    while (n-- > 0) {
      String plain = "";
      for (int i = 0; i < encryptedText.length() / 2; i++) {
        plain += encryptedText.charAt(i + encryptedText.length() / 2);
        plain += encryptedText.charAt(i);
      }
      if (encryptedText.length() % 2 > 0) {
        plain += encryptedText.charAt(encryptedText.length() - 1);
      }
      encryptedText = plain;
    }
    return encryptedText;
  }
}
