class Solution {
  static double solution(double[] arrVal, String[] arrUnit) {
    double newtons = 6.67e-11 * arrVal[0] * arrVal[1] / (arrVal[2] * arrVal[2]);
    for (String el : arrUnit) {
      newtons /= el.equals("g") ? 1e3 : el.equals("mg") ? 1e6 : el.equals("μg") ? 1e9 : el.equals("ft") ? .092903 : 1;
      newtons *= el.equals("lb") ? .45359 : el.equals("cm") ? 1e4 : el.equals("mm") ? 1e6 : el.equals("μm") ? 1e12 : 1;
    }
    return newtons;
  }
}
