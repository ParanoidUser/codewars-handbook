import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class OXAdjudicatorExampleTest {
  @Test
  public void testJudgeEx() {
    assertEquals("X_WIN", OXAdjudicator.judge(List.of(0, 1, 4, 8, 3, 6, 5)));
    assertEquals("NO_WINNER", OXAdjudicator.judge(List.of(4, 2, 8, 0, 1, 7, 5, 3, 6)));
    assertEquals("O_WIN", OXAdjudicator.judge(List.of(0, 2, 4, 5, 6, 8)));
  }
}
