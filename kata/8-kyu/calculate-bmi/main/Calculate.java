interface Calculate {
  static String bmi(double weight, double height) {
    double bmi = weight / Math.pow(height, 2);
    return bmi > 30 ? "Obese" : bmi > 25 ? "Overweight" : bmi > 18.5 ? "Normal" : "Underweight";
  }
}
