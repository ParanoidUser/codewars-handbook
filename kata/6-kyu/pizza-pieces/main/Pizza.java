interface Pizza {
  static int maxPizza(int cut) {
      return cut < 0 ? -1 : cut * (cut + 1) / 2 + 1;
  }
}
