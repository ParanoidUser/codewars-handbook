interface Kata {
  static int findNextPower(int val, int pow) {
    double root  = Math.pow(val, 1. / pow);
    return (int) Math.pow(Math.ceil(root), pow);
  }
}