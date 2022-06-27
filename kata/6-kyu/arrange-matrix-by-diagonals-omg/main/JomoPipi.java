interface JomoPipi {
  static char[][] diagonalSort(char[][] data) {
    var sorted = new char[data.length][data[0].length];
    int x = 0;
    int y = 0;
    for (char[] row : data)
      for (char el : row) {
        sorted[x--][y++] = el;
        if (x < 0 || y > row.length - 1) {
          x += y + 1;
          y = 0;
          if (x > data.length - 1) {
            y = x - data.length + 1;
            x -= y;
          }
        }
      }
    return sorted;
  }
}
