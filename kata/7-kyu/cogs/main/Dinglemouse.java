interface Dinglemouse {
  static double cogRpm(int[] cogs) {
    return (cogs.length % 2 == 0 ? -1. : 1.) * cogs[0] / cogs[cogs.length - 1];
  }
}
