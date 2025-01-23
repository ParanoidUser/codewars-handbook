interface GrayCode {
  static String evenGrayCode(int size, int position) {
    return ("%" + size + "s").formatted(Integer.toBinaryString(position) + Integer.bitCount(position) % 2).replace(' ', '0');
  }
}