import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void player1Won() {
    assertEquals("Player 1 won!", Kata.rps("rock", "scissors"));
    assertEquals("Player 1 won!", Kata.rps("scissors", "paper"));
    assertEquals("Player 1 won!", Kata.rps("paper", "rock"));
  }

  @Test
  void player2Won() {
    assertEquals("Player 2 won!", Kata.rps("scissors", "rock"));
    assertEquals("Player 2 won!", Kata.rps("paper", "scissors"));
    assertEquals("Player 2 won!", Kata.rps("rock", "paper"));
  }

  @Test
  void draw() {
    assertEquals("Draw!", Kata.rps("scissors", "scissors"));
    assertEquals("Draw!", Kata.rps("paper", "paper"));
    assertEquals("Draw!", Kata.rps("rock", "rock"));
  }
}
