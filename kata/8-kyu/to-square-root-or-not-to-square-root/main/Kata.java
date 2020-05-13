import static java.util.stream.IntStream.of;

interface Kata {
  static int[] squareOrSquareRoot(int[] array) {
    return of(array).map(i -> Math.sqrt(i) % 1 > 0 ? i * i : (int) Math.sqrt(i)).toArray();
  }
}
