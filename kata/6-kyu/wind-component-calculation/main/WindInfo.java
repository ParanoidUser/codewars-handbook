interface WindInfo {
  static String message(String rwy, int windDirection, int windSpeed) {
    int a = windDirection - 10 * Integer.parseInt(rwy.substring(0, 2));
    int cw = (int) Math.round(Math.sin(Math.toRadians(a)) * windSpeed);
    int hw = (int) Math.round(Math.cos(Math.toRadians(a)) * windSpeed);
    return String.format("%swind %s knots. Crosswind %s knots from your %st.", hw < 0 ? "Tail" : "Head", Math.abs(hw), Math.abs(cw), cw < 0 ? "lef" : "righ");
  }
}
