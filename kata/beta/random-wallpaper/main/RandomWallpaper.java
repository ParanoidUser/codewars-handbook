import static java.util.stream.IntStream.of;

import java.security.SecureRandom;

class RandomWallpaper {
  int[] randomOrder(int[] wallpapers) {
    return of(wallpapers).boxed().sorted((a, b) -> new SecureRandom().nextInt(-1, 2)).mapToInt(i -> i).toArray();
  }
}