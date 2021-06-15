interface Kata {
  static String fatFingers(String str) {
    if (str == null) return null;
    var output = new StringBuilder();
    var caps = false;
    for (char c : str.toCharArray()) {
      if (c == 'a' || c == 'A') {
        caps = !caps;
        continue;
      }
      output.append(caps ? Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c) : c);
    }
    return output.toString();
  }
}