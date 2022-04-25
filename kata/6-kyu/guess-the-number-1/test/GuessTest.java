import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.security.SecureRandom;
import org.junit.jupiter.api.Test;

class GuessTest {

  @Test
  void sample() {
    int guess = new SecureRandom().nextInt(1, 1001);
    var solution1 = new GuesserSolution();
    solution1.setAnswer(guess);
    assertEquals(guess, solution1.getNumber());

    assertThrows(Guesser.GameException.class, () -> new GuesserSolution().guess(1));

    var solution2 = new GuesserSolution();
    solution2.setAnswer(42);
    assertThrows(Guesser.GameException.class, () -> solution2.setAnswer(42));

    var solution3 = new GuesserSolution();
    solution3.setAnswer(42);
    for (int i = 0; i < 9; i++) {
      solution3.guess(i);
    }
    assertThrows(Guesser.GameException.class, () -> solution3.guess(10));

    var solution4 = new GuesserSolution();
    solution4.setAnswer(42);
    for (int i = 0; i < 10; i++) {
      solution4.guess(42);
    }
    assertThrows(Guesser.GameException.class, () -> solution4.guess(42));
  }
}
