import static java.util.stream.IntStream.of;

interface CircleOfChildren {
  static int[] distributionOfCandy(int[] candies) {
    var times = 0;
    while (of(candies).distinct().count() != 1) {
      int prev = (candies[0] + candies[0] % 2) / 2;
      for (int i = candies.length - 1; i >= 0; i--) {
        int next = (candies[i] + candies[i] % 2) / 2;
        candies[i] = prev + next;
        prev = next;
      }
      times++;
    }
    return new int[]{times, candies[0]};
  }
}