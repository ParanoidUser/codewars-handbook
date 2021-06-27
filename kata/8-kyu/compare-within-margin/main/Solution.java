interface Solution {
  static int closeCompare(double a, double b) {
    return closeCompare(a, b, 0);
  }
  
  static int closeCompare(double a, double b, double margin) {
    return margin < Math.abs(a - b) ? Double.compare(a, b) : 0;
  }
}