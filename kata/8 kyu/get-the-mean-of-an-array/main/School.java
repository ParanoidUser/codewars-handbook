import static java.util.stream.IntStream.of;

class School {
  static int getAverage(int[] marks) {
    return (int) of(marks).average().getAsDouble();
  }
}
