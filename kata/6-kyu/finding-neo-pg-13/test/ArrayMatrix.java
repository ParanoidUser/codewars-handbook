class ArrayMatrix implements Matrix {

  private final int[][] matrix;
  private final int size;

  public ArrayMatrix(int[][] matrix) {
    this.matrix = matrix;
    this.size = matrix.length;
  }

  public int size() {
    return size;
  }

  public int get(int x, int y) {
    return matrix[x][y];
  }
}