class Block {
  private final int[] s;
  private final int v;
  private final int sa;

  Block(int[] sides) {
    s = sides;
    v = s[0] * s[1] * s[2];
    sa = 2 * (s[0] * s[1] + s[1] * s[2] + s[0] * s[2]);
  }

  int getWidth() {
    return s[0];
  }

  int getLength() {
    return s[1];
  }

  int getHeight() {
    return s[2];
  }

  int getVolume() {
    return v;
  }

  int getSurfaceArea() {
    return sa;
  }
}
