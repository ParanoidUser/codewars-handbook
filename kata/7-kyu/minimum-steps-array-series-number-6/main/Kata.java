import static java.util.stream.IntStream.of;

class Kata {
  static int minimumSteps(int[] numbers, int k) {
    int count = 0;
    while ((k -= of(numbers).sorted().toArray()[count]) > 0) count++;
    return count;
  }
}
