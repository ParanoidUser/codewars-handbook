interface BlueAndRedMarbles {
  static double guessBlue(double blueStart, double redStart, int bluePulled, int redPulled) {
    return (blueStart -= bluePulled) / (blueStart + redStart - redPulled);
  }
}
