import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertTrue(Kata.isSatorSquare(new char[][]{
        {'P', 'E', 'R'},
        {'E', 'V', 'E'},
        {'R', 'E', 'P'}}));

    assertFalse(Kata.isSatorSquare(new char[][]{
        {'K', 'N', 'I', 'T'},          // warning:
        {'N', 'O', 'R', 'I'},          // O and 0 look similar
        {'I', 'R', '0', 'N'},          // but are not the same
        {'T', 'I', 'N', 'K'}}));

    assertTrue(Kata.isSatorSquare(new char[][]{
        {'S', 'A', 'T', 'O', 'R'},
        {'A', 'R', 'E', 'P', 'O'},
        {'T', 'E', 'N', 'E', 'T'},
        {'O', 'P', 'E', 'R', 'A'},
        {'R', 'O', 'T', 'A', 'S'}}));

    assertFalse(Kata.isSatorSquare(new char[][]{
        {'S', 'A', 'T', 'O', 'R'},
        {'A', 'R', 'E', 'P', 'O'},
        {'T', '3', 'N', '3', 'T'},
        {'O', 'P', 'E', 'R', 'A'},
        {'R', 'O', 'T', 'A', 'S'}}));
  }
}