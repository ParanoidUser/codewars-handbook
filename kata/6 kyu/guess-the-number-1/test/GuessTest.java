import static java.util.concurrent.ThreadLocalRandom.current;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GuessTest {
  @Test
  public void testBasic() {
    int guess = current().nextInt(1, 1001);
    GuesserSolution solution = new GuesserSolution();
    solution.setAnswer(guess);
    assertEquals(guess, solution.getNumber());
  }
}
