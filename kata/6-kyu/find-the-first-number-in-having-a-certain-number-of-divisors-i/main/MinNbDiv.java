import static java.util.stream.IntStream.iterate;
import static java.util.stream.IntStream.rangeClosed;

interface MinNbDiv {
  static int findMinNum(int num) {
    return iterate(1, i -> i + 1).filter(i -> rangeClosed(1, i / 2).filter(j -> i % j < 1).count() == num - 1).findFirst().orElse(0);
  }
}