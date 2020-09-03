import static java.util.stream.IntStream.of;

interface Kata {
  static int stantonMeasure(int[] arr) {
    return (int) of(arr).filter(i -> i == of(arr).filter(j -> j == 1).count()).count();
  }
}
