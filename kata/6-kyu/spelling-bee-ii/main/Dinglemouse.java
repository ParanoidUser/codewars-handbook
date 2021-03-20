import static java.util.stream.IntStream.range;
import static java.util.stream.Stream.iterate;
import static org.apache.commons.lang3.tuple.Pair.of;

import java.util.List;
import java.util.function.BiPredicate;

interface Dinglemouse {
  static int howManyBees(char[][] hive) {
    List<BiPredicate<Integer, Integer>> directions = List.of(
        (i, j) -> i > 1 && hive[i - 1][j] == 'e' && hive[i - 2][j] == 'e',
        (i, j) -> i < hive.length - 2 && hive[i + 1][j] == 'e' && hive[i + 2][j] == 'e',
        (i, j) -> j > 1 && hive[i][j - 1] == 'e' && hive[i][j - 2] == 'e',
        (i, j) -> j < hive[i].length - 2 && hive[i][j + 1] == 'e' && hive[i][j + 2] == 'e',
        (i, j) -> i < hive.length - 2 && j < hive.length - 2 && hive[i + 1][j + 1] == 'e' && hive[i + 2][j + 2] == 'e',
        (i, j) -> i > 1 && j > 1 && hive[i - 1][j - 1] == 'e' && hive[i - 2][j - 2] == 'e',
        (i, j) -> i < hive.length - 2 && j > 1 && hive[i + 1][j - 1] == 'e' && hive[i + 2][j - 2] == 'e',
        (i, j) -> i > 1 && j < hive.length - 2 && hive[i - 1][j + 1] == 'e' && hive[i - 2][j + 2] == 'e'
    );

    return iterate(0, i -> hive != null && i < hive.length, i -> i + 1)
        .flatMap(i -> range(0, hive[i].length).filter(j -> hive[i][j] == 'b').mapToObj(j -> of(i, j)))
        .mapToInt(ij -> (int) directions.stream().filter(d -> d.test(ij.getLeft(), ij.getRight())).count())
        .sum();
  }
}
