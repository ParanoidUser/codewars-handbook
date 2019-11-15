import static java.util.stream.IntStream.of;

class Kata {
  static int[] squareOrSquareRoot(int[] array) {
    return of(array).map(i -> Math.sqrt(i) % 1 == 0 ? (int) Math.sqrt(i) : i * i).toArray();
  }
}
