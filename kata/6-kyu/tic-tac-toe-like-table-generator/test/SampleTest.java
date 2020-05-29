import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals(" O | X \n-------\n X | O ", Kata.displayBoard(new char[]{'O', 'X', 'X', 'O'}, 2));
    assertEquals(" O | X |   \n-----------\n   | X |   \n-----------\n X | O |   ", Kata.displayBoard(new char[]{'O', 'X', ' ', ' ', 'X', ' ', 'X', 'O', ' '}, 3));
    assertEquals(" O | X |   |   | X \n-------------------\n   | X | O |   | O ", Kata.displayBoard(new char[]{'O', 'X', ' ', ' ', 'X', ' ', 'X', 'O', ' ', 'O'}, 5));
    assertEquals(" O | X \n-------\n   |   \n-------\n X |   \n-------\n X | O \n-------\n   | O ", Kata.displayBoard(new char[]{'O', 'X', ' ', ' ', 'X', ' ', 'X', 'O', ' ', 'O'}, 2));
    assertEquals(" 1 | 2 | 3 | 4 | 5 | 1 \n-----------------------\n 2 | 3 | 4 | 5 | 1 | 2 \n-----------------------\n 3 | 4 | 5 | 1 | 2 | 3 \n-----------------------\n 4 | 5 | 1 | 2 | 3 | 4 \n-----------------------\n 5 | 1 | 2 | 3 | 4 | 5 \n-----------------------\n 1 | 2 | 3 | 4 | 5 | 1 ", Kata.displayBoard(new char[]{'1', '2', '3', '4', '5', '1', '2', '3', '4', '5', '1', '2', '3', '4', '5', '1', '2', '3', '4', '5', '1', '2', '3', '4', '5', '1', '2', '3', '4', '5', '1', '2', '3', '4', '5', '1'}, 6));
  }
}