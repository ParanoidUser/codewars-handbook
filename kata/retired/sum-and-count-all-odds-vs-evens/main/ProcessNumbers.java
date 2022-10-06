import static java.util.stream.IntStream.of;

interface ProcessNumbers {
  static int[] processNumbers(int[] numbers) {
    if (numbers == null) return new int[2];
    var even = of(numbers).filter(i -> i % 2 == 0).summaryStatistics();
    var odd = of(numbers).filter(i -> i % 2 > 0).summaryStatistics();
    return new int[] {
      (int) Math.pow(even.getSum(), even.getCount()), (int) Math.pow(odd.getSum(), odd.getCount())
    };
  }
}
