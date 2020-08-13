interface Kata {
  static boolean SubstringTest(String str1, String str2) {
    return (str1 + "_" + str2).matches("(?i).*(\\w{2}).*_.*\\1.*");
  }
}
