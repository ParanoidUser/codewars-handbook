interface Kata {
  static double[] mapVector(double[] vector, double[] circle1, double[] circle2) {
    var ratio = circle2[2] / circle1[2];
    return new double[]{
        circle2[0] - (circle1[0] - vector[0]) * ratio,
        circle2[1] - (circle1[1] - vector[1]) * ratio
    };
  }
}