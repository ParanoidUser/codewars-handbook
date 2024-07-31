import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(new GameScore('T', 0), Kata.determineWinner(new char[][]{
        {'X', 'X', 'X'},
        {'X', 'X', 'X'},
        {'X', 'X', 'X'}
    }));
    assertEquals(new GameScore('W', 5), Kata.determineWinner(new char[][]{
        {'W', 'B', 'W'},
        {'B', 'W', 'B'},
        {'W', 'B', 'W'}
    }));
    assertEquals(new GameScore('B', 17), Kata.determineWinner(new char[][]{
        {'W', 'W', 'W', 'B', 'B', 'B'},
        {'W', 'W', 'W', 'W', 'B', 'B'},
        {'W', 'W', 'W', 'B', 'B', 'B'},
        {'W', 'X', 'W', 'B', 'B', 'B'},
        {'X', 'W', 'B', 'B', 'B', 'B'},
        {'W', 'W', 'B', 'X', 'B', 'X'}
    }));
  }
}