import static java.util.concurrent.ThreadLocalRandom.current;
import static java.util.stream.IntStream.of;

class RandomWallpaper {
  int[] randomOrder(int[] wallpapers) {
    return of(wallpapers).boxed().sorted((a, b) -> current().nextInt(-1, 2)).mapToInt(i -> i).toArray();
  }
}