interface Scramblies {
  static boolean scramble(String str1, String str2) {
    for (char c : str1.toCharArray()) {
      str2 = str2.replaceFirst(c + "" , "");
    }
    return str2.isEmpty();
  }
}