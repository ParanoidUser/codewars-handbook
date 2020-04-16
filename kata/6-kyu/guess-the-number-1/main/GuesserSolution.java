class GuesserSolution extends Guesser {
  int getNumber() {
    int down = 1, up = 1000, mid;
    while (true) {
      switch (guess(mid = down + (up - down) / 2)) {
        case "Too high!": up = --mid; break;
        case "Too low!":  down = ++mid; break;
        default: return mid;
      }
    }
  }
}
