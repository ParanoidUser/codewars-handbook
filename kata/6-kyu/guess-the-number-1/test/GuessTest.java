import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.security.SecureRandom;
import org.junit.jupiter.api.Test;

class GuessTest {

  @Test
  void sample() {
    var top = new GuesserSolution();
    top.setAnswer(1);
    assertEquals(1, top.getNumber());

    var mid = new GuesserSolution();
    mid.setAnswer(500);
    assertEquals(500, mid.getNumber());

    var bottom = new GuesserSolution();
    bottom.setAnswer(1000);
    assertEquals(1000, bottom.getNumber());

    int guess = new SecureRandom().nextInt(1, 1001);
    var random = new GuesserSolution();
    random.setAnswer(guess);
    assertEquals(guess, random.getNumber());

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
