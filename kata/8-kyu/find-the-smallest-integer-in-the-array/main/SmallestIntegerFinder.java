import static java.util.stream.IntStream.of;

interface SmallestIntegerFinder {
  static int findSmallestInt(int[] args) {
    return of(args).min().orElse(0);
  }
}
