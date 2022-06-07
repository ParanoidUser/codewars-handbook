interface GrassHopper {
  static String weatherInfo(double temp) {
    double c = (temp - 32) * 5. / 9;
    return c + " is " + (c > 0 ? "above " : "") + "freezing temperature";
  }
}
