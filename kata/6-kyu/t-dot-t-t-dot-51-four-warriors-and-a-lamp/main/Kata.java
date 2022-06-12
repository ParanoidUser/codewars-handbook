import static java.util.stream.IntStream.of;

interface Kata {
  static int shortestTime(int[] speed) {
    speed = of(speed).sorted().toArray();
    return speed[0] + speed[1] + speed[3] + Math.min(2 * speed[1], speed[0] + speed[2]);
  }
}
