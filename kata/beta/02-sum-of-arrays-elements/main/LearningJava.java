import static java.util.stream.IntStream.rangeClosed;

class LearningJava {
  static int Sum1(int[] array) {
    return rangeClosed(1, array.length).map(i -> i * array[i - 1]).sum();
  }
}