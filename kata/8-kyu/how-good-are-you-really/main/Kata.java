import static java.util.stream.IntStream.of;

interface Kata {
  static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    return of(classPoints).average().orElse(0) < yourPoints;
  }
}
