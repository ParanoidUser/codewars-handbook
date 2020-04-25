interface WrapPresent {
  static int wrap(int height, int width, int length) {
    return 2 * (width + height + length + Math.min(height, Math.min(width, length)) + 10);
  }
}
