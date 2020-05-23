interface Solution {
  static int sequence(int n) {
    return "10112022".charAt(n % 8) - 48;
  }
}