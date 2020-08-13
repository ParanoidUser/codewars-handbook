interface NotePassing {
  static String decipher(String codedMessage) {
    var text = new StringBuilder();
    for (char c : codedMessage.toCharArray()) {
      if (Character.isLetter(c)) {
        c += c < 'T' || c > '`' && c < 't' ? 7 : -19;
      }
      text.append(c);
    }
    return text.toString();
  }
}
