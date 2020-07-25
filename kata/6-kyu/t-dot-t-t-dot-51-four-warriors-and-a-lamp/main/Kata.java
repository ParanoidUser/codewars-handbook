import static java.util.stream.IntStream.of;

interface Kata {
  static int shortestTime(int[] speed) {
    return (speed = of(speed).sorted().toArray())[0] + speed[1] + speed[3] + Math.min(2 * speed[1], speed[0] + speed[2]);
  }
}
