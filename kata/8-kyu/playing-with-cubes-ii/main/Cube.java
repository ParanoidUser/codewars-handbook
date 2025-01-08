class Cube {
  private int side;

  Cube() {
    this(0);
  }

  Cube(int side) {
    setSide(side);
  }

  int getSide() {
    return side;
  }

  void setSide(int side) {
    this.side = Math.abs(side);
  }
}