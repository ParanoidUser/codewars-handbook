class Finder {
  private static int[][] mountain;
  private static int[][] field;
  private static boolean madeChange;

  static int pathFinder(String map) {
    mountain = map.lines().map(String::chars).map(stream -> stream.map(c -> c - 48).toArray()).toArray(int[][]::new);
    field = new int[mountain.length][mountain.length];
    field[0][0] = 1;

    do {
      madeChange = false;
      for (int ii = 0; ii < field.length; ii++) {
        for (int jj = 0; jj < field.length; jj++) {
          int value = getValue(ii, jj);
          if (value > 0) {
            updateValue(ii, jj, 1, 0);
            updateValue(ii, jj, 0, 1);
            updateValue(ii, jj, -1, 0);
            updateValue(ii, jj, 0, -1);
          }
        }
      }
    } while (madeChange);

    if (field[field.length - 1][field.length - 1] > 0) {
      return field[field.length - 1][field.length - 1] - 1;
    }

    return -1;
  }

  private static void updateValue(int i, int j, int deltaI, int deltaJ) {
    int oldValue = getValue(i + deltaI, j + deltaJ);
    if (oldValue < 0) {
      return;
    }

    int newValue = getValue(i, j) + Math.abs(mountain[i][j] - mountain[i + deltaI][j + deltaJ]);
    if (oldValue == 0 || newValue < oldValue) {
      field[i + deltaI][j + deltaJ] = newValue;
      madeChange = true;
    }
  }

  private static int getValue(int i, int j) {
    if (i >= 0 && i < field.length && j >= 0 && j < field.length) {
      return field[i][j];
    }
    return -2;
  }
}
