import static java.util.stream.IntStream.range;
import static java.util.stream.Stream.iterate;
import static org.apache.commons.lang3.tuple.Pair.of;

import java.util.function.BiPredicate;

interface Dinglemouse {
  static int howManyBees(char[][] hive) {
    var bs = iterate(0, i -> hive != null && i < hive.length, i -> i + 1).flatMap(i -> range(0, hive[i].length).filter(j -> hive[i][j] == 'b').mapToObj(j -> of(i, j))).toList();

    BiPredicate<Integer, Integer> up = (i, j) -> i > 1 && hive[i - 1][j] == 'e' && hive[i - 2][j] == 'e';
    BiPredicate<Integer, Integer> down = (i, j) -> i < hive.length - 2 && hive[i + 1][j] == 'e' && hive[i + 2][j] == 'e';
    BiPredicate<Integer, Integer> left = (i, j) -> j > 1 && hive[i][j - 1] == 'e' && hive[i][j - 2] == 'e';
    BiPredicate<Integer, Integer> right = (i, j) -> j < hive[i].length - 2 && hive[i][j + 1] == 'e' && hive[i][j + 2] == 'e';

    var bees = 0;
    for (var ij : bs) {
      if (up.test(ij.getLeft(), ij.getRight())) bees++;
      if (down.test(ij.getLeft(), ij.getRight())) bees++;
      if (left.test(ij.getLeft(), ij.getRight())) bees++;
      if (right.test(ij.getLeft(), ij.getRight())) bees++;
    }
    return bees;
  }
}
