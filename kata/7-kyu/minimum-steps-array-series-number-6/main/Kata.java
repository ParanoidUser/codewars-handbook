import static java.util.stream.IntStream.of;

interface Kata {
  static int minimumSteps(int[] numbers, int k) {
    var count = 0;
    while ((k -= of(numbers).sorted().toArray()[count]) > 0) count++;
    return count;
  }
}
