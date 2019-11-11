class Solution {
  static double solution(double[] arrVal, String[] arrUnit) {
    double newtons = 6.67e-11 * arrVal[0] * arrVal[1] / (arrVal[2] * arrVal[2]);
    for (String el : arrUnit) {
      newtons /= el == "g" ? 1e3 : el == "mg" ? 1e6 : el == "μg" ? 1e9 : el == "ft" ? 0.3048 * 0.3048 : 1;
      newtons *= el == "lb" ? 0.45359 : el == "cm" ? 1e4 : el == "mm" ? 1e6 : el == "μm" ? 1e12 : 1;
    }
    return newtons;
  }
}
