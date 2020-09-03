interface isogram {
  static boolean isIsogram(String str) {
    return str.toLowerCase().chars().distinct().count() == str.length();
  }
}
