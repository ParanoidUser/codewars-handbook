import java.util.List;

interface EvenAverage {
  static double averageOfEvens(List<Integer> numbers) {
    return numbers.stream().mapToInt(i -> i).filter(i -> i % 2 == 0).average().orElse(0);
  }
}