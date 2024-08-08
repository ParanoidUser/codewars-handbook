interface JomoPipi {
  static int[] mutationLocation(char[][] body) {
    for (int i = 1; i < body.length; i++) {
      for (int j = 0; j < body[i].length; j++) {
        if (body[0][j] != body[i][j]) {
          return new int[]{i > 1 || body[0][j] == body[2][j] ? i : 0, j};
        }
      }
    }
    return new int[0];
  }
}