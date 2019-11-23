class Evaporator {
  static int evaporator(double content, double evap_per_day, double threshold) {
    return (int) Math.ceil(Math.log(threshold / 100.) / Math.log(1. - evap_per_day / 100.));
  }
}
