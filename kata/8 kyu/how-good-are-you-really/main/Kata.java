import java.util.Arrays;

class Kata {
  static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
  }
}
