import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class SolutionTest {

  @Test
  void player1Wins() {
    assertEquals("Player 1 Won!", Kata.rpsls("scissors", "paper"));
    assertEquals("Player 1 Won!", Kata.rpsls("paper", "rock"));
    assertEquals("Player 1 Won!", Kata.rpsls("rock", "lizard"));
    assertEquals("Player 1 Won!", Kata.rpsls("lizard", "spock"));
    assertEquals("Player 1 Won!", Kata.rpsls("spock", "scissors"));
    assertEquals("Player 1 Won!", Kata.rpsls("scissors", "lizard"));
    assertEquals("Player 1 Won!", Kata.rpsls("lizard", "paper"));
    assertEquals("Player 1 Won!", Kata.rpsls("paper", "spock"));
    assertEquals("Player 1 Won!", Kata.rpsls("spock", "rock"));
    assertEquals("Player 1 Won!", Kata.rpsls("rock", "scissors"));
  }

  @Test
  void player2Wins() {
    assertEquals("Player 2 Won!", Kata.rpsls("scissors", "spock"));
    assertEquals("Player 2 Won!", Kata.rpsls("spock", "lizard"));
    assertEquals("Player 2 Won!", Kata.rpsls("lizard", "rock"));
    assertEquals("Player 2 Won!", Kata.rpsls("rock", "paper"));
    assertEquals("Player 2 Won!", Kata.rpsls("paper", "scissors"));
    assertEquals("Player 2 Won!", Kata.rpsls("scissors", "rock"));
    assertEquals("Player 2 Won!", Kata.rpsls("rock", "spock"));
    assertEquals("Player 2 Won!", Kata.rpsls("spock", "paper"));
    assertEquals("Player 2 Won!", Kata.rpsls("paper", "lizard"));
    assertEquals("Player 2 Won!", Kata.rpsls("lizard", "scissors"));
  }

  @Test
  void draws() {
    assertEquals("Draw!", Kata.rpsls("scissors", "scissors"));
    assertEquals("Draw!", Kata.rpsls("paper", "paper"));
    assertEquals("Draw!", Kata.rpsls("rock", "rock"));
    assertEquals("Draw!", Kata.rpsls("lizard", "lizard"));
    assertEquals("Draw!", Kata.rpsls("spock", "spock"));
  }
}
