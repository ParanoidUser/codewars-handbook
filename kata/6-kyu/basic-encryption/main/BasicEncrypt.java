class BasicEncrypt {
  String encrypt(String text, int rule) {
    return new String(text.chars().map(c -> (c + rule) % 256).toArray(), 0, text.length());
  }
}
