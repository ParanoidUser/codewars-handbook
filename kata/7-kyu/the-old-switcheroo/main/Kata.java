interface Kata {
  static String vowel2Index(String s) {
    var result = new StringBuilder();
    for (var i = 0; i < s.length(); i++) {
      result.append("aeiou".indexOf(s.charAt(i)) < 0 ? s.charAt(i) : i + 1 + "");
    }
    return result.toString();
  }
}
