interface OddEvenSort {
  static String sortMyString(String s) {
    StringBuilder odd = new StringBuilder(), even = new StringBuilder();
    for (var i = 0; i < s.length(); i++) {
      (i % 2 == 0 ? even : odd).append(s.charAt(i));
    }
    return even.append(" ").append(odd).toString();
  }
}
