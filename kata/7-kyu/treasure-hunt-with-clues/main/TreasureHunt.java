interface TreasureHunt {
  static int findTreasure(int[][] grid, int row, int col) {
    int cell;
    while ((cell = grid[row - 1][col - 1]) != 10 * row + col) {
      row = cell / 10;
      col = cell % 10;
    }
    return cell;
  }
}