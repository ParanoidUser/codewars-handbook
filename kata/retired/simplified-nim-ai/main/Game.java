class Game {
  private int turns = 3;

  int turn(int count) {
    return count > 0 && count < 4 && turns-- > 0 ? 4 - count : error();
  }

  private int error() {
    throw new IllegalArgumentException("Bad turn");
  }
}
