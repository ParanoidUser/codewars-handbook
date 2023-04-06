interface DTC {
  static double toIndustrial(int time) {
    return Math.round(time * 1.66667) / 100.;
  }

  static double toIndustrial(String time) {
    return Integer.parseInt(time.split(":")[0]) + toIndustrial(Integer.parseInt(time.split(":")[1]));
  }

  static String toNormal(double time) {
    return String.format("%d:%02d", (int) time, (int) Math.round(time / .0166667) % 60);
  }
}