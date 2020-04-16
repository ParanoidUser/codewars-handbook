class Calculate {
  static String bmi(double weight, double height) {
    return (weight /= Math.pow(height, 2)) > 30 ? "Obese" : weight > 25 ? "Overweight" : weight > 18.5 ? "Normal" : "Underweight";
  }
}
