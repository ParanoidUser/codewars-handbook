interface ArrayReverser {
  static String[] reverse(String[] a) {
    var reverse = new StringBuilder(String.join("", a)).reverse().toString();
    for (int i = 0, from = 0; i < a.length; from += a[i].length(), i++) {
      a[i] = reverse.substring(from, from + a[i].length());
    }
    return a;
  }
}
