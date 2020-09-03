interface Dinglemouse {
  static int riders(int[] stations) {
    int traveled = 0, riders = 1;
    for (int distance : stations) {
      if ((traveled += distance) > 100) {
        riders++;
        traveled = distance;
      }
    }
    return riders;
  }
}
