interface JapaneseName {
  static String asciiConvertToJapanese(String name) {
    if (name == null || name.isEmpty()) {
      return "";
    }

    var up = true;
    var jap = new StringBuilder();
    for (char c : name.toLowerCase().toCharArray()) {
      if (Character.isWhitespace(c)) {
        jap.append(" ");
        up = true;
        continue;
      }

      if (c < 97 || c > 122) {
        return "Only ASCII";
      }

      var alphabet = new String[]{
          "ka", "zu", "mi", "te", "ku",
          "lu", "ji", "ri", "ki", "zusu",
          "me", "ta", "rin", "to", "mo",
          "no", "ke", "shi", "ari", "chi",
          "do", "ru", "mei", "na", "fu", "zi"
      };
      var j = alphabet[c - 97];
      if (up) {
        j = Character.toUpperCase(j.charAt(0)) + j.substring(1);
        up = false;
      }
      jap.append(j);
    }
    return jap.toString();
  }
}