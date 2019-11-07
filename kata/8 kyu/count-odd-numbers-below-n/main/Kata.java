import java.util.stream.IntStream;

class Kata {
  static int oddCount(int n) {
    return (int) IntStream.range(0, n).filter(i -> i % 2 != 0).count();
  }
}
