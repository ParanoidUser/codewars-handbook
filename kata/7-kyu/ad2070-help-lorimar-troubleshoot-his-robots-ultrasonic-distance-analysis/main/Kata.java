interface Kata {
  static double[] sensorAnalysis(Object[][] sensorData) {
    double mean = 0;
    for (Object[] data : sensorData) {
      mean += (double) data[1];
    }
    mean /= sensorData.length;

    double deviation = 0;
    for (Object[] data : sensorData) {
      deviation += Math.pow((double) data[1] - mean, 2);
    }
    deviation /= sensorData.length - 1;

    return new double[] {Math.round(mean * 10e3) / 10e3, Math.round(Math.sqrt(deviation) * 10e3) / 10e3};
  }
}
