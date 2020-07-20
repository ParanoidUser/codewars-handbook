interface MissingAlphabet {
  static String insertMissingLetters(String str) {
    return str.chars()
        .mapToObj(c -> (char) c + "ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(c - 96))
        .reduce("", (r, s) -> r + (r.indexOf(s.charAt(0)) < 0 ? s : s.charAt(0)))
        .replaceAll("[" + str.toUpperCase() + "]", "");
  }
}
