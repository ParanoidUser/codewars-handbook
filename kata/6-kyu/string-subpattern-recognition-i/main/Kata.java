interface Kata {
  static boolean hasSubpattern(String str) {
    return (str + str).indexOf(str, 1) != str.length();
  }
}
