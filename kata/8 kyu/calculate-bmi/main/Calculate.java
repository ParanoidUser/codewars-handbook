class Calculate {
  static String bmi(double weight, double height) {
    weight /= Math.pow(height, 2);
    return weight > 30 ? "Obese" : weight > 25 ? "Overweight" : weight > 18.5 ? "Normal" : "Underweight";
  }
}
