import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class RegexTicTacToeWinCheckerTest {
  @Test
  void sample() {
    assertTrue(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("XXX-O-O-O"));
    assertTrue(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("X--OOOX-X"));
    assertTrue(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("O--OO-XXX"));
    assertTrue(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("O-XOX-O-X"));
    assertTrue(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("OXOOXOXX-"));
    assertTrue(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("X-O-OOXXO"));
    assertTrue(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("XO--X-OOX"));
    assertTrue(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("X-OXOOOXX"));
    assertFalse(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("XO-------"));
    assertFalse(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("XX-XOO---"));
    assertFalse(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("-XX-OO-O-"));
    assertFalse(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("OXO--XXO-"));
    assertFalse(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("OOXXXO---"));
    assertFalse(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("OXXX-XOO-"));
    assertFalse(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("OOXXX----"));
    assertFalse(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("XXOOXXOO-"));
    assertFalse(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("OXOXOX---"));
  }
}
