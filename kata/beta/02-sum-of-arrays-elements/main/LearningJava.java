import static java.util.stream.IntStream.rangeClosed;

interface LearningJava {
  static int sum(int[] array) {
    return rangeClosed(1, array.length).map(i -> i * array[i - 1]).sum();
  }
}