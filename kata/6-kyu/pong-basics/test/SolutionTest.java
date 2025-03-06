import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void player1() {
    Pong game = new Pong(1);
    assertEquals("Player 1 has hit the ball!", game.play(360, 363));
    assertEquals("Player 1 has won the game!", game.play(575, 582));
    assertEquals("Game Over!", game.play(-1, -1));
  }

  @Test
  void player2() {
    Pong game = new Pong(2);
    assertEquals("Player 1 has hit the ball!", game.play(50, 53));
    assertEquals("Player 2 has hit the ball!", game.play(100, 97));
    assertEquals("Player 1 has missed the ball!", game.play(0, 4));
    assertEquals("Player 2 has hit the ball!", game.play(25, 25));
    assertEquals("Player 2 has won the game!", game.play(75, 25));
    assertEquals("Game Over!", game.play(50, 50));
  }
}