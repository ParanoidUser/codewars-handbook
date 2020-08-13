interface Dinglemouse {
  static double[] cogRpm(int[] cogs, int n) {
    return new double[] {
      (n % 2 == 0 ? 1. : -1.) * cogs[n] / cogs[0],
      ((cogs.length - 1 - n) % 2 == 0 ? 1. : -1.) * cogs[n] / cogs[cogs.length - 1]
    };
  }
}
