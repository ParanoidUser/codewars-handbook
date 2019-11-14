import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KataTest {
  @Test
  public void test1() {
    assertEquals("Player 1 won!", Kata.rps("rock", "scissors"));
    assertEquals("Player 1 won!", Kata.rps("scissors", "paper"));
    assertEquals("Player 1 won!", Kata.rps("paper", "rock"));
  }

  @Test
  public void test2() {
    assertEquals("Player 2 won!", Kata.rps("scissors", "rock"));
    assertEquals("Player 2 won!", Kata.rps("paper", "scissors"));
    assertEquals("Player 2 won!", Kata.rps("rock", "paper"));
  }

  @Test
  public void test3() {
    assertEquals("Draw!", Kata.rps("scissors", "scissors"));
    assertEquals("Draw!", Kata.rps("paper", "paper"));
    assertEquals("Draw!", Kata.rps("rock", "rock"));
  }
}
