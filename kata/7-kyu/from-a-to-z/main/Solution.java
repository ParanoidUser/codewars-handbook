interface Solution {
  static String gimmeTheLetters(String s) {
    var az = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    return az.substring(az.indexOf(s.charAt(0)), az.indexOf(s.charAt(2)) + 1);
  }
}