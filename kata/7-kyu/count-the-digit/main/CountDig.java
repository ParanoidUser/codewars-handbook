import static java.util.stream.IntStream.rangeClosed;

interface CountDig {
  static int nbDig(int n, int d) {
    return (int) rangeClosed(0, n).flatMap(i -> ("" + i * i).chars()).filter(i -> i == (char) (d + '0')).count();
  }
}
