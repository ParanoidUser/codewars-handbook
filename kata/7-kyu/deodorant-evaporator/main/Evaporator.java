interface Evaporator {
  static int evaporator(double content, double evapPerDay, double threshold) {
    return (int) Math.ceil(Math.log(threshold / 100.) / Math.log(1. - evapPerDay / 100.));
  }
}
