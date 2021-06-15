interface Solution {
  static String diagonal(int[][] matrix) {
    var score = 0;
    for (var i = 0; i < matrix.length; i++) {
      score += matrix[i][i];
      score -= matrix[i][matrix.length - 1 - i];
    }
    return score == 0 ? "Draw!" : (score > 0 ? "Principal" : "Secondary") + " Diagonal win!";
  }
}
