import static java.util.stream.IntStream.range;

interface Remover {
  static int[] removeSmallest(int[] numbers) {
    int min = range(0, numbers.length).reduce((i, j) -> numbers[i] > numbers[j] ? j : i).orElse(-1);
    return range(0, numbers.length).filter(i -> i != min).map(i -> numbers[i]).toArray();
  }
}