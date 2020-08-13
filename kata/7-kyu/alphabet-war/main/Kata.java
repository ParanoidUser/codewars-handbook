interface Kata {
  static String alphabetWar(String fight) {
    int t = fight.chars().reduce(0, (a, b) -> (b = "wpbs0zdqm".indexOf(b)) < 0 ? a : a + b - 4);
    return t == 0 ? "Let's fight again!" : (t < 0 ? "Left" : "Right") + " side wins!";
  }
}
