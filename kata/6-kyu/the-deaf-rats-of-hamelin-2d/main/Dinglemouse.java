import java.util.Map;
import java.util.function.BiPredicate;

interface Dinglemouse {
  static int countDeafRats(char[][] townSquare) {
    var piper = new int[]{-1, -1};
    for (var i = 0; piper[0] < 0; i++) {
      piper[0] = new String(townSquare[i]).indexOf('P');
      piper[1] = i;
    }

    var goingWrong = Map.<Character, BiPredicate<Integer, Integer>>of(
            '↙', (x, y) -> y >= piper[1] - piper[0] + x,
            '↗', (x, y) -> y <= piper[1] - piper[0] + x,
            '↖', (x, y) -> y <= piper[1] + piper[0] - x,
            '↘', (x, y) -> y >= piper[1] + piper[0] - x,
            '↑', (x, y) -> y <= piper[1],
            '↓', (x, y) -> y >= piper[1],
            '←', (x, y) -> x <= piper[0],
            '→', (x, y) -> x >= piper[0]);

    var deaf = 0;
    for (var i = 0; i < townSquare.length; i++) {
      for (var j = 0; j < townSquare[i].length; j++) {
        if (goingWrong.getOrDefault(townSquare[i][j], (x, y) -> false).test(j, i)) {
          deaf++;
        }
      }
    }
    return deaf;
  }
}
