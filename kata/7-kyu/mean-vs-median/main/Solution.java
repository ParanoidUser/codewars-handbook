import static java.util.stream.IntStream.of;

interface Solution {
  static String meanVsMedian(int[] numbers) {
    int mean = (int) of(numbers).average().orElse(0.);
    int median = of(numbers).sorted().toArray()[numbers.length / 2];
    return mean > median ? "mean" : mean < median ? "median" : "same";
  }
}
