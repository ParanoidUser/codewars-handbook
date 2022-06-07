interface BlueAndRedMarbles {
  static double guessBlue(double blueStart, double redStart, int bluePulled, int redPulled) {
    double blues = blueStart - bluePulled;
    double reds = redStart - redPulled;
    return blues / (blues + reds);
  }
}
