interface FusionChamberShutdown {
  static int[] burner(int c, int h, int o) {
    int h2o = Math.min(o, h / 2);
    int co2 = Math.min(c, (o - h2o) / 2);
    int ch4 = Math.min(c - co2, (h - 2 * h2o) / 4);
    return new int[]{h2o, co2, ch4};
  }
}