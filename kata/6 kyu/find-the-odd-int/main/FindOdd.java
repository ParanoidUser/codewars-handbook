import static java.util.stream.IntStream.of;

class FindOdd {
  static int findIt(int[] a) {
    return of(a).reduce(0, (s, i) -> s ^ i);
  }
}
