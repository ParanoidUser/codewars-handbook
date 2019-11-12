class GrassHopper {
  static String weatherInfo(int temp) {
    double c = (temp - 32) * 5.0 / 9;
    return c + " is " + (c > 0 ? "above " : "") + "freezing temperature";
  }
}
