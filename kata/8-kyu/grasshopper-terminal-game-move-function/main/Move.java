interface Move {
  static int move(int position, int roll) {
    return 2 * roll + position;
  }
}
