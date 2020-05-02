import static java.util.stream.IntStream.of;

interface Kata {
  static int[] countPositivesSumNegatives(int[] input) {
    return input == null || input.length == 0 ?
        new int[0] :
        new int[]{(int) of(input).filter(d -> d > 0).count(), of(input).filter(d -> d < 0).sum()};
  }
}
