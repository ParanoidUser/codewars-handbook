import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KataTests {
  @Test
  void sample() {
    assertArrayEquals(new double[]{118.6275, 3.5779}, Kata.sensorAnalysis(
        new Object[][]{
            {"Distance:", 116.28, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 117.1, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 123.96, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 117.17, "Meters", "Sensor 5 malfunction =>lorimar"}
        }
    ), .0001);

    assertArrayEquals(new double[]{215.2265, 68.4014}, Kata.sensorAnalysis(
        new Object[][]{
            {"Distance:", 295.68, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 294.78, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 298.21, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 294.84, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 296.54, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 133.84, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 294.41, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 294.82, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 134.61, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 294.86, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 170.88, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 170.87, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 170.47, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 135.5, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 170.9, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 170.08, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 171.36, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 170.08, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 170.92, "Meters", "Sensor 5 malfunction =>lorimar"},
            {"Distance:", 170.88, "Meters", "Sensor 5 malfunction =>lorimar"}
        }
    ), .0001);
  }
}
