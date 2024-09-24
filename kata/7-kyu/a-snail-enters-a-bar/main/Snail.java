interface Snail {
  static boolean canSnailReachEnd(double length, double speed, double lengthIncreases) {
    return speed - lengthIncreases > length / 525600;
  }
}