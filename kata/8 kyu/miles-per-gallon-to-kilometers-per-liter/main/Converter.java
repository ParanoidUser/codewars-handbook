class Converter {
  static float mpgToKPM(float mpg) {
    return Math.round(35.4006 * mpg) / 100.0f;
  }
}
