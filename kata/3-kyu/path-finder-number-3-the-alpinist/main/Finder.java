interface Finder {
  static int pathFinder(String map) {
    int[][] mount = map.lines().map(String::chars).map(s -> s.map(c -> c - 48).toArray()).toArray(int[][]::new);
    var field = new int[mount.length][mount.length];
    field[0][0] = 1;

    boolean keepClimbing;
    do {
      keepClimbing = false;
      for (var x = 0; x < field.length; x++) {
        for (var y = 0; y < field.length; y++) {
          keepClimbing |= climb(mount, field, x, y, x + 1, y) > 0;
          climb(mount, field, x, y, x - 1, y);
          keepClimbing |= climb(mount, field, x, y, x, y + 1) > 0;
          climb(mount, field, x, y, x, y - 1);
        }
      }
    } while (keepClimbing);
    return field[field.length - 1][field.length - 1] - 1;
  }

  private static int climb(int[][] mount, int[][] field, int x, int y, int dx, int dy) {
    int alt0 = field[x][y] + Math.abs(mount[x][y] - altitude(mount, dx, dy));
    int alt1 = altitude(field, dx, dy);
    if (alt1 != 0 && alt1 <= alt0) {
      return -1;
    }
    field[dx][dy] = alt0;
    return alt0;
  }

  private static int altitude(int[][] location, int x, int y) {
    return x >= 0 && x < location.length && y >= 0 && y < location.length ? location[x][y] : -1;
  }
}
