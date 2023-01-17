import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  private final String[][] fighters = {
    {"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
    {"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"},
  };

  @Test
  void shouldWorkWithNoMoves() {
    String[] solution = new String[0];
    assertArrayEquals(solution, Solution.streetFighterSelection(fighters, new int[] {0, 0}, new String[0]));
  }

  @Test
  void shouldWorkWithFewMoves() {
    String[] moves = {"up", "left", "right", "left", "left"};
    String[] solution = {"Ryu", "Vega", "Ryu", "Vega", "Balrog"};
    assertArrayEquals(solution, Solution.streetFighterSelection(fighters, new int[] {0, 0}, moves));
  }

  @Test
  void shouldWorkWhenAlwaysMovingLeft() {
    String[] moves = {"left", "left", "left", "left", "left", "left", "left", "left"};
    String[] solution = {"Vega", "Balrog", "Guile", "Blanka", "E.Honda", "Ryu", "Vega", "Balrog"};
    assertArrayEquals(solution, Solution.streetFighterSelection(fighters, new int[] {0, 0}, moves));
  }

  @Test
  void shouldWorkWhenAlwaysMovingRight() {
    String[] moves = {"right", "right", "right", "right", "right", "right", "right", "right"};
    String[] solution = {
      "E.Honda", "Blanka", "Guile", "Balrog", "Vega", "Ryu", "E.Honda", "Blanka"
    };
    assertArrayEquals(solution, Solution.streetFighterSelection(fighters, new int[] {0, 0}, moves));
  }

  @Test
  void shouldUseAll4DirectionsClockwiseTwice() {
    String[] moves = {"up", "left", "down", "right", "up", "left", "down", "right"};
    String[] solution = {"Ryu", "Vega", "M.Bison", "Ken", "Ryu", "Vega", "M.Bison", "Ken"};
    assertArrayEquals(solution, Solution.streetFighterSelection(fighters, new int[] {0, 0}, moves));
  }

  @Test
  void shouldWorkWhenAlwaysMovingDown() {
    String[] moves = {"down", "down", "down", "down"};
    String[] solution = {"Ken", "Ken", "Ken", "Ken"};
    assertArrayEquals(solution, Solution.streetFighterSelection(fighters, new int[] {0, 0}, moves));
  }

  @Test
  void shouldWorkWhenAlwaysMovingUp() {
    String[] moves = {"up", "up", "up", "up"};
    String[] solution = {"Ryu", "Ryu", "Ryu", "Ryu"};
    assertArrayEquals(solution, Solution.streetFighterSelection(fighters, new int[] {0, 0}, moves));
  }
}