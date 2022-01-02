import static java.util.Arrays.stream;
import static java.util.concurrent.ThreadLocalRandom.current;
import static java.util.stream.IntStream.concat;

interface LOTTO {
  static int[] numberGenerator() {
    var raffle = current().ints(1, 51).distinct().limit(7).sorted().toArray();
    raffle[6] = current().nextInt(10);
    return raffle;
  }

  static int checkForWinningCategory(int[] checkCombination, int[] winningCombination) {
    long match = concat(stream(winningCombination, 0, 6), stream(checkCombination, 0, 6)).distinct().count();
    int category = (int) (2 * (12 - match) + (checkCombination[6] == winningCombination[6] ? 1 : 0));
    return new int[]{-1, -1, -1, -1, -1, 9, 8, 7, 6, 5, 4, 3, 2, 1}[category];
  }
}