import static java.util.Arrays.fill;

interface Kata {
  static int[][][] createOctahedron(int size) {
    var octahedron = new int[Math.abs(size)][Math.abs(size)][Math.abs(size)];
    for (int z = 0, axis = 0; size % 2 > 0 && z < size; z++, axis = z > size / 2 ? size - z - 1 : z) {
      int x0 = size / 2;
      int xN = size / 2;
      for (int y = size / 2 - axis; y <= size / 2 + axis; y++) {
        fill(octahedron[z][y], x0, xN + 1, 1);
        x0 += y < size / 2 ? -1 : 1;
        xN += y < size / 2 ? 1 : -1;
      }
    }
    return size > 2 && size % 2 > 0 ? octahedron : new int[0][][];
  }
}
