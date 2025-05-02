interface Solution {
  static boolean validateBase(String num, int base) {
    return num.chars().allMatch(c -> "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c) < base);
  }
}