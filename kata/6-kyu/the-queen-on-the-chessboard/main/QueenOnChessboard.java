import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

interface QueenOnChessboard {
  static List<String> availableMoves(String position) {
    if (position == null || !position.matches("[A-H][1-8]")) {
      return List.of();
    }

    BiPredicate<Integer, Integer> queenMove = (x, y) -> {
      int dx = Math.abs(x - position.charAt(0));
      int dy = Math.abs(y - position.charAt(1));
      return dx == dy && dx * dy > 0 || dx != dy && dx * dy < 1;
    };

    return "ABCDEFGH".chars().mapToObj(x -> "12345678".chars().filter(y -> queenMove.test(x, y))
        .mapToObj(y -> (char) x + "" + (char) y)).flatMap(Stream::sorted).toList();
  }
}