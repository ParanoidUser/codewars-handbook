class Slope {
  String slope(int[] points) {
    return points[0] == points[2] ? "undefined" : "" + (points[3] - points[1]) / (points[2] - points[0]);
  }
}
