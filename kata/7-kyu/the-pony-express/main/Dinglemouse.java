interface Dinglemouse {
  static int riders(int[] stations) {
    int traveled = 0;
    int riders = 1;
    for (int distance : stations) {
      traveled += distance;
      if (traveled > 100) {
        riders++;
        traveled = distance;
      }
    }
    return riders;
  }
}
