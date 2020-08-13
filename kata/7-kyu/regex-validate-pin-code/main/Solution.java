interface Solution {
  static boolean validatePin(String pin) {
    return pin.matches("\\d{4}|\\d{6}");
  }
}
