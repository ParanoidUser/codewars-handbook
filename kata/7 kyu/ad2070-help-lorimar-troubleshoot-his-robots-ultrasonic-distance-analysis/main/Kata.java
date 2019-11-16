class Kata {
  static double[] sensorAnalysis(Object[][] sensor_data) {
    double mean = 0;
    for (Object[] data : sensor_data) {
      mean += (double) data[1];
    }
    mean /= sensor_data.length;

    double deviation = 0;
    for (Object[] data : sensor_data) {
      deviation += Math.pow((double) data[1] - mean, 2);
    }
    deviation /= sensor_data.length - 1;

    return new double[] {Math.round(mean * 10e3) / 10e3, Math.round(Math.sqrt(deviation) * 10e3) / 10e3};
  }
}
