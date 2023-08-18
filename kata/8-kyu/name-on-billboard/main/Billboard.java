interface Billboard {
  static int billboard(String name, int price) {
    return name.repeat(price).length();
  }
}