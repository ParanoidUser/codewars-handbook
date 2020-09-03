interface ReverseNumber {
  static int reverse(int number) {
    return number < 0 ? -reverse(-number) : Integer.parseInt(new StringBuilder("" + number).reverse().toString());
  }
}
