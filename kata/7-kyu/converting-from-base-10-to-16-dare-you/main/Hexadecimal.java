interface Hexadecimal {
  static String convertToHex(int a) {
    var sb = new StringBuilder();
    while (a != 0) {
      sb.append("0123456789ABCDEF".charAt(a % 16));
      a /= 16;
    }
    return "0x" + sb.reverse().toString();
  }
}
