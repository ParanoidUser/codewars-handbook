import static java.util.stream.IntStream.of;

interface School {
  static int getAverage(int[] marks) {
    return (int) of(marks).average().orElse(0);
  }
}
