interface GrassHopper {
  static String weatherInfo(double temp) {
    return (temp = (temp - 32) * 5. / 9) + " is " + (temp > 0 ? "above " : "") + "freezing temperature";
  }
}
