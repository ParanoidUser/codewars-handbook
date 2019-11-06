class Kata {
  static int grow(int[] x) {
    return java.util.Arrays.stream(x).reduce(1, (a, b) -> a * b);
  }
}
