import static java.util.stream.IntStream.rangeClosed;

interface Kata {
  static double[] cartesianNeighborsDistance(int x, int y, int range) {
    return rangeClosed(1, range).asDoubleStream()
        .flatMap(i -> rangeClosed(0, (int) i).asDoubleStream().map(j -> Math.sqrt(i * i + j * j)))
        .distinct().toArray();
  }
}
