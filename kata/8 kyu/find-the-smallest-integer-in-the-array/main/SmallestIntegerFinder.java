import java.util.stream.IntStream;

class SmallestIntegerFinder {
  static int findSmallestInt(int[] args) {
    return IntStream.of(args).min().getAsInt();
  }
}
