interface SecondOcurrence {
  static int second_symbol(String str, char c) {
    return str.indexOf(c, str.indexOf(c) + 1);
  }
}