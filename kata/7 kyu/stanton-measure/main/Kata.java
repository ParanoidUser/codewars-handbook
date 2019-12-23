import static java.util.stream.IntStream.of;

class Kata {
  static int stantonMeasure(int[] arr) {
    return (int) of(arr).filter(i -> i == of(arr).filter(j -> j == 1).count()).count();
  }
}
