interface AlienVirusEstimator {
  static long findVirusUnits(long unitsEscaped, long increasePerMinute, long minutesPassed) {
    return Math.max(--minutesPassed * increasePerMinute + unitsEscaped, -1);
  }
}