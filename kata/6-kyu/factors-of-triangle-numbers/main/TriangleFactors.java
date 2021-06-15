import static java.util.stream.IntStream.iterate;

class TriangleFactors {
  int calculate(int n) {
    for (var i = 2; ; i++) {
      int sum = i * (i + 1) / 2;
      if (n < 2 * iterate(1, j -> sum > j * j, j -> j + 1).filter(j -> sum % j == 0).count()) {
        return sum;
      }
    }
  }
}