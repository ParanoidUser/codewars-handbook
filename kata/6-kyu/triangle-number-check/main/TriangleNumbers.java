interface TriangleNumbers {
  static boolean isTriangleNumber(long number) {
    return Math.sqrt(8 * number + 1.) % 1 == 0;
  }
}
