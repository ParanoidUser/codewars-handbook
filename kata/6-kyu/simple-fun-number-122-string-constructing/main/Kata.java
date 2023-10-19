interface Kata {
  static int stringConstructing(String a, String s) {
    int i = 0;
    for (char c : s.toCharArray()) {
      while (c != a.charAt(i++ % a.length())) ;
    }
    return (i + a.length() - 1) / a.length() * (a.length() + 1) - s.length();
  }
}