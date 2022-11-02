interface SharkPontoon {
  static String shark(int dist1, int dist2, double speed1, double speed2, boolean slow) {
    return dist1 / speed1 < (slow ? 2 : 1) * dist2 / speed2 ? "Alive!" : "Shark Bait!";
  }
}