class Kata {
  static double find_average(int[] array) {
    return java.util.stream.IntStream.of(array).average().getAsDouble();
  }
}
