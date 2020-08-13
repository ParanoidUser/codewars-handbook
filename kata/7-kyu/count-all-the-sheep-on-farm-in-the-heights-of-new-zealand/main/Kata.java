import static java.util.stream.IntStream.of;

interface Kata {
  static int lostSheeps(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepsTotal) {
    return sheepsTotal - of(fridayNightCounting).sum() - of(saturdayNightCounting).sum();
  }
}
