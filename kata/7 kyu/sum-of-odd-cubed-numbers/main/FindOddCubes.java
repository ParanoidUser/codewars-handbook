import static java.util.stream.IntStream.of;

class FindOddCubes {
  static int cubeOdd(int[] arr) {
    return of(arr).map(n -> n % 2 != 0 ? n * n * n : 0).sum();
  }
}
