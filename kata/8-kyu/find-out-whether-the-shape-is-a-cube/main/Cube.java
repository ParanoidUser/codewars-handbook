interface Cube {
  static boolean isCube(int volume, int side) {
    return volume > 0 && volume == Math.pow(side, 3);
  }
}