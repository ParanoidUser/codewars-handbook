interface Kata {
  static int seatsInTheater(int nCols, int nRows, int col, int row) {
    return (nCols - --col) * (nRows - row);
  }
}
