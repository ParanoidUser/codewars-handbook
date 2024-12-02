interface Mango {
  static int mango(int quantity, int price) {
    return price * (quantity - quantity / 3);
  }
}