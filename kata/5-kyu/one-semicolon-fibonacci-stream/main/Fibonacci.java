interface Fibonacci {
  static java.util.stream.IntStream stream(int a, int b) {
    return java.util.stream.Stream.iterate(new int[]{a, b}, i -> new int[]{i[1], i[0] + i[1]}).mapToInt(i -> i[0]);
  }
}