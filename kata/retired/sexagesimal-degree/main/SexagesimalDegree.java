interface SexagesimalDegree {
  static String convert(double lat, double lon) {
    if (lat < -90 || lat > 90 || lon < -180 || lon > 180) throw new IllegalArgumentException();
    return String.format("%s %s, %s %s", createFromFloat(Math.abs(lat)), lat < 0 ? "S" : "N", createFromFloat(Math.abs(lon)), lon < 0 ? "W" : "E");
  }

  static String createFromFloat(double value) {
    double m = (value - (int) value) * 60.;
    double s = (m - (int) m) * 60.;
    return String.format("%s° %s′ %s″", (int) value, (int) m, Math.round(s));
  }
}