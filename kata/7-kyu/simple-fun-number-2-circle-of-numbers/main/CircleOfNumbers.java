interface CircleOfNumbers {
  static int circleOfNumbers(int n, int firstNumber) {
    return (n / 2 + firstNumber) % n;
  }
}
