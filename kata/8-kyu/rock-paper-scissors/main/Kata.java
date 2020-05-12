interface Kata {
  static String rps(String p1, String p2) {
    return p1.equals(p2) ? "Draw!" : "Player " + ("rockscissors paperrock scissorspaper".contains(p1 + p2) ? 1 : 2) + " won!";
  }
}
