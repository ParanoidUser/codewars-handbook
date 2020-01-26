import static java.util.stream.IntStream.of;

class CircleOfChildren {
  static int[] distributionOfCandy(int[] candies) {
    int times = 0, dist[];
    while (of(dist = candies.clone()).distinct().count() != 1) {
      for (int i = 0; i < dist.length; i++) {
        candies[i] += Math.ceil((i > 0 ? dist[i - 1] : dist[dist.length - 1]) / 2.) - dist[i] / 2;
      }
      times++;
    }
    return new int[] {times, candies[0]};
  }
}
