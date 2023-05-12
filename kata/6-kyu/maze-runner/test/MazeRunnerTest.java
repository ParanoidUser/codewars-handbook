import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MazeRunnerTest {
  private final int[][] maze = {
          {1, 0, 1, 1, 1, 1, 1},
          {1, 0, 0, 0, 0, 0, 3},
          {1, 0, 1, 0, 1, 0, 1},
          {0, 0, 1, 0, 0, 0, 1},
          {1, 0, 1, 0, 1, 0, 1},
          {1, 0, 0, 0, 0, 0, 0},
          {1, 2, 1, 0, 1, 0, 1}};

  @Test
  void sample() {
    assertEquals("Finish", MazeRunner.walk(maze, new String[]{"N", "N", "N", "N", "N", "E", "E", "E", "E", "E"}));
    assertEquals("Finish", MazeRunner.walk(maze, new String[]{"N", "N", "N", "N", "N", "E", "E", "S", "S", "E", "E", "N", "N", "E"}));
    assertEquals("Finish", MazeRunner.walk(maze, new String[]{"N", "N", "N", "N", "N", "E", "E", "E", "E", "E", "W", "W"}));
    assertEquals("Dead", MazeRunner.walk(maze, new String[]{"N", "N", "N", "W", "W"}));
    assertEquals("Dead", MazeRunner.walk(maze, new String[]{"N", "N", "N", "N", "N", "E", "E", "S", "S", "S", "S", "S", "S"}));
    assertEquals("Dead", MazeRunner.walk(maze, new String[]{"N", "N", "N", "N", "N", "N", "N"}));
    assertEquals("Dead", MazeRunner.walk(maze, new String[]{"N", "E", "E", "E", "E", "E", "E"}));
    assertEquals("Lost", MazeRunner.walk(maze, new String[]{"N", "E", "E", "E", "E"}));
  }
}