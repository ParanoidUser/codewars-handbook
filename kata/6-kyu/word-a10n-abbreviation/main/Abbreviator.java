class Abbreviator {
  String abbreviate(String string) {
    for (var s : string.split("[^a-zA-Z]")) {
      string = string.replaceFirst(s, s.length() > 3 ? "" + s.charAt(0) + (s.length() - 2) + s.substring(s.length() - 1) : s);
    }
    return string;
  }
}
