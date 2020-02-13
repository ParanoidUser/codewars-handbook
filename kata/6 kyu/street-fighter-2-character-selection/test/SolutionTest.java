import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  String[][] fighters = {
    {"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
    {"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"},
  };

  @Test
  public void shouldWorkWithNoMoves() {
    String[] solution = new String[0];
    assertArrayEquals(solution, Solution.streetFighterSelection(fighters, new int[] {0, 0}, new String[0]));
  }

  @Test
  public void shouldWorkWithFewMoves() {
    String[] moves = {"up", "left", "right", "left", "left"};
    String[] solution = {"Ryu", "Vega", "Ryu", "Vega", "Balrog"};
    assertArrayEquals(solution, Solution.streetFighterSelection(fighters, new int[] {0, 0}, moves));
  }

  @Test
  public void shouldWorkWhenAlwaysMovingLeft() {
    String[] moves = {"left", "left", "left", "left", "left", "left", "left", "left"};
    String[] solution = {"Vega", "Balrog", "Guile", "Blanka", "E.Honda", "Ryu", "Vega", "Balrog"};
    assertArrayEquals(solution, Solution.streetFighterSelection(fighters, new int[] {0, 0}, moves));
  }

  @Test
  public void shouldWorkWhenAlwaysMovingRight() {
    String[] moves = {"right", "right", "right", "right", "right", "right", "right", "right"};
    String[] solution = {
      "E.Honda", "Blanka", "Guile", "Balrog", "Vega", "Ryu", "E.Honda", "Blanka"
    };
    assertArrayEquals(solution, Solution.streetFighterSelection(fighters, new int[] {0, 0}, moves));
  }

  @Test
  public void shouldUseAll4DirectionsClockwiseTwice() {
    String[] moves = {"up", "left", "down", "right", "up", "left", "down", "right"};
    String[] solution = {"Ryu", "Vega", "M.Bison", "Ken", "Ryu", "Vega", "M.Bison", "Ken"};
    assertArrayEquals(solution, Solution.streetFighterSelection(fighters, new int[] {0, 0}, moves));
  }

  @Test
  public void shouldWorkWhenAlwaysMovingDown() {
    String[] moves = {"down", "down", "down", "down"};
    String[] solution = {"Ken", "Ken", "Ken", "Ken"};
    assertArrayEquals(solution, Solution.streetFighterSelection(fighters, new int[] {0, 0}, moves));
  }

  @Test
  public void shouldWorkWhenAlwaysMovingUp() {
    String[] moves = {"up", "up", "up", "up"};
    String[] solution = {"Ryu", "Ryu", "Ryu", "Ryu"};
    assertArrayEquals(solution, Solution.streetFighterSelection(fighters, new int[] {0, 0}, moves));
  }
}
