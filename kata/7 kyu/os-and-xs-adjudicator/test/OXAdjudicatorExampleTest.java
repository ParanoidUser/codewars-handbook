import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class OXAdjudicatorExampleTest {
  @Test
  public void testJudgeEx() {
    OXAdjudicator judge = new OXAdjudicator();
    List<Integer> game1 = new ArrayList<>();
    game1.add(0);
    game1.add(1);
    game1.add(4);
    game1.add(8);
    game1.add(3);
    game1.add(6);
    game1.add(5); // X_WIN

    List<Integer> game2 = new ArrayList<>();
    game2.add(4);
    game2.add(2);
    game2.add(8);
    game2.add(0);
    game2.add(1);
    game2.add(7);
    game2.add(5);
    game2.add(3);
    game2.add(6); // NO_WINNER

    List<Integer> game3 = new ArrayList<>();
    game3.add(0);
    game3.add(2);
    game3.add(4);
    game3.add(5);
    game3.add(6);
    game3.add(8); // O_WIN

    String result = judge.judge(game1);
    assertEquals("Game1 expected result X was " + result, "X_WIN", result);
    result = judge.judge(game2);
    assertEquals("Game2 expected result Draw was " + result, "NO_WINNER", result);
    result = judge.judge(game3);
    assertEquals("Game3 expected result O", "O_WIN", result);
  }
}
