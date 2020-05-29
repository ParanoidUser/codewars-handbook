import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface Kata {
  static String displayBoard(char[] board, int width) {
    return range(0, board.length).mapToObj(
        i -> " " + board[i] + ' ' + (i < board.length - 1 ? (i + 1) % width > 0 ? "|" : '\n' + "-".repeat(4 * width - 1) + '\n' : "")
    ).collect(joining());
  }
}