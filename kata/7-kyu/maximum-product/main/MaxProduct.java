import static java.util.stream.IntStream.range;

class MaxProduct {
  int adjacentElementsProduct(int[] array) {
    return range(0, array.length - 1).map(i -> array[i] * array[i + 1]).max().orElse(0);
  }
}
