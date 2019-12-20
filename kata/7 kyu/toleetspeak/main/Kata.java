class Kata {
  static String toLeetSpeak(String speak) {
    var alphabet = "@8(D3F6#!JK1MN0PQR$7UVWXY2";
    var result = new StringBuilder();
    for (char c : speak.toCharArray()) {
      result.append(c > 64 && c < 91 ? alphabet.charAt(c - 65) : c);
    }
    return result.toString();
  }
}
