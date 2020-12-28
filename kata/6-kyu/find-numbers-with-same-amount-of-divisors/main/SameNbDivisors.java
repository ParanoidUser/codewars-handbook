import static java.util.stream.IntStream.range;

import java.util.function.IntUnaryOperator;

interface SameNbDivisors {
  static int countPairsInt(int diff, long nMax) {
    IntUnaryOperator countDivs = i -> (int) range(1, i / 2 + 1).filter(j -> i % j < 1).count();
    return (int) range(1, (int) (nMax - diff)).filter(i -> countDivs.applyAsInt(i) == countDivs.applyAsInt(i + diff)).count();
  }
}