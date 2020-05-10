interface Converter {
  static float mpgToKPM(float mpg) {
    return Math.round(35.4006f * mpg) / 100f;
  }
}
