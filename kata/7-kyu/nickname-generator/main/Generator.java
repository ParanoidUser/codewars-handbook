interface Generator {
  static String nickname(String name) {
    return name.length() > 3 ? name.substring(0, name.matches("^.{2}[aeiou].+") ? 4 : 3) : "Error: Name too short";
  }
}
