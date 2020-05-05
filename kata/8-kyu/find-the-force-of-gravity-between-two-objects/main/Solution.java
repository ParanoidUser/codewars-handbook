import java.util.Map;

interface Solution {
  static double solution(double[] arrVal, String[] arrUnit) {
    var units = Map.of("g", 1e-3, "mg", 1e-6, "μg", 1e-9, "lb", .45359, "cm", .01, "mm", .001, "μm", 1e-6, "ft", .3048);
    double m1 = arrVal[0] * units.getOrDefault(arrUnit[0], 1.);
    double m2 = arrVal[1] * units.getOrDefault(arrUnit[1], 1.);
    double r = arrVal[2] * units.getOrDefault(arrUnit[2], 1.);
    return 6.67e-11 * m1 * m2 / r / r;
  }
}
