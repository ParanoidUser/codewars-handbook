import static java.util.stream.IntStream.range;

interface MazeRunner {
  static String walk(int[][] maze, String[] directions) {
    var yx = range(0, maze.length).boxed().flatMap(y ->
            range(0, maze.length).boxed().filter(x -> maze[y][x] == 2)
                    .map(x -> new int[]{y, x})).findFirst().orElseThrow();

    for (var d : directions) {
      if (d.equals("N")) yx[0]--;
      if (d.equals("S")) yx[0]++;
      if (d.equals("W")) yx[1]--;
      if (d.equals("E")) yx[1]++;

      if (yx[0] < 0 || yx[1] < 0 || yx[0] >= maze.length || yx[1] >= maze.length || maze[yx[0]][yx[1]] == 1) {
        return "Dead";
      } else if (maze[yx[0]][yx[1]] == 3) {
        return "Finish";
      }
    }
    return "Lost";
  }
}