class Kata {
  static int[][][] createOctahedron(int size) {
    int[][][] octahedron = new int[Math.abs(size)][Math.abs(size)][Math.abs(size)];
    for (int z = 0; z < size; z++) {
      for (int y = 0; y < size; y++) {
        for (int x = 0; x < size; x++) {
          if (Math.abs(y - size / 2) + Math.abs(x - size / 2) < z + 1) {
            octahedron[z][y][x] = size / 2 + 1 > z ? 1 : octahedron[size - z - 1][y][x];
          }
        }
      }
    }
    return size < 3 || size % 2 == 0 ? new int[0][][] : octahedron;
  }
}
